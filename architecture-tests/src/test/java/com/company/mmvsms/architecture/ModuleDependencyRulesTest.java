package com.company.mmvsms.architecture;

import com.tngtech.archunit.core.domain.Dependency;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "com.company.mmvsms", importOptions = ImportOption.DoNotIncludeTests.class)
public class ModuleDependencyRulesTest {

  @ArchTest
  static final ArchRule api_should_not_depend_on_impl =
      noClasses().that().resideInAPackage("..modules..api..")
          .should().dependOnClassesThat().resideInAnyPackage(
              "..modules..application..",
              "..modules..domain..",
              "..modules..infra.."
          );

  @ArchTest
  static final ArchRule impl_should_only_depend_on_other_modules_api =
      classes().that().resideInAnyPackage(
              "..modules..application..",
              "..modules..domain..",
              "..modules..infra.."
          )
          .should(OnlyDependOnOtherModulesApiCondition.onlyDependOnOtherModulesApi());

  private static final class OnlyDependOnOtherModulesApiCondition extends ArchCondition<JavaClass> {
    private OnlyDependOnOtherModulesApiCondition() {
      super("only depend on other modules via api");
    }

    static ArchCondition<JavaClass> onlyDependOnOtherModulesApi() {
      return new OnlyDependOnOtherModulesApiCondition();
    }

    @Override
    public void check(JavaClass item, ConditionEvents events) {
      String originModule = moduleName(item.getPackageName());
      if (originModule == null) {
        return;
      }

      for (Dependency dependency : item.getDirectDependenciesFromSelf()) {
        JavaClass target = dependency.getTargetClass();
        String targetPackage = target.getPackageName();
        String targetModule = moduleName(targetPackage);
        if (targetModule == null) {
          continue;
        }
        if (originModule.equals(targetModule)) {
          continue;
        }
        if (!isApiPackage(targetPackage)) {
          String message = String.format(
              "Module %s depends on %s in module %s via %s",
              originModule,
              target.getName(),
              targetModule,
              dependency.getDescription());
          events.add(SimpleConditionEvent.violated(item, message));
        }
      }
    }

    private static String moduleName(String packageName) {
      String marker = ".modules.";
      int start = packageName.indexOf(marker);
      if (start < 0) {
        return null;
      }
      start += marker.length();
      int end = packageName.indexOf('.', start);
      if (end < 0) {
        return packageName.substring(start);
      }
      return packageName.substring(start, end);
    }

    private static boolean isApiPackage(String packageName) {
      return packageName.contains(".api.") || packageName.endsWith(".api");
    }
  }
}

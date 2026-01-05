package com.company.mmvsms.architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.company.mmvsms", importOptions = ImportOption.DoNotIncludeTests.class)
public class LayeredArchitectureTest {

  @ArchTest
  static final ArchRule layers_respected = layeredArchitecture()
      .consideringAllDependencies()
      .layer("API").definedBy("..modules..api..")
      .layer("Domain").definedBy("..modules..domain..")
      .layer("Application").definedBy("..modules..application..")
      .layer("Infrastructure").definedBy("..modules..infra..")
      .whereLayer("API").mayOnlyBeAccessedByLayers("API", "Application", "Infrastructure")
      .whereLayer("Domain").mayOnlyBeAccessedByLayers("Domain", "Application", "Infrastructure")
      .whereLayer("Application").mayOnlyBeAccessedByLayers("Application", "Infrastructure")
      .whereLayer("Infrastructure").mayOnlyBeAccessedByLayers("Infrastructure");
}

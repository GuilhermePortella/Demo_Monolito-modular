package com.company.mmvsms.architecture;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModulithArchitectureTest {

  @Test
  void modules_should_respect_modulith_rules() {
    ApplicationModules.of("com.company.mmvsms.modules").verify();
  }
}

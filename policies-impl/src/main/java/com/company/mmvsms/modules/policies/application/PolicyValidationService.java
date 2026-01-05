package com.company.mmvsms.modules.policies.application;

import com.company.mmvsms.modules.policies.api.PolicyValidationPort;
import com.company.mmvsms.modules.shared.api.Money;

public final class PolicyValidationService implements PolicyValidationPort {
  @Override
  public void validateExpense(String expenseId, Money total) {
    // Policy checks would live here.
  }
}

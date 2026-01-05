package com.company.mmvsms.modules.policies.api;

import com.company.mmvsms.modules.shared.api.Money;

public interface PolicyValidationPort {
  void validateExpense(String expenseId, Money total);
}

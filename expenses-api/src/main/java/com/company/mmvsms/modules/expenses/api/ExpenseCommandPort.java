package com.company.mmvsms.modules.expenses.api;

import com.company.mmvsms.modules.shared.api.Money;

public interface ExpenseCommandPort {
  void submitExpense(String expenseId, Money total);
}

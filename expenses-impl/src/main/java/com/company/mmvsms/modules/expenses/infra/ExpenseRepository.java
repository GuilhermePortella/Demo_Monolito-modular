package com.company.mmvsms.modules.expenses.infra;

import com.company.mmvsms.modules.expenses.domain.Expense;

public interface ExpenseRepository {
  void save(Expense expense);
}

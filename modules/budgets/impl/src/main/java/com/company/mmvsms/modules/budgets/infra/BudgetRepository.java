package com.company.mmvsms.modules.budgets.infra;

import com.company.mmvsms.modules.budgets.domain.BudgetReservation;

public interface BudgetRepository {
  void save(BudgetReservation reservation);
}

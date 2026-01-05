package com.company.mmvsms.modules.budgets.application;

import com.company.mmvsms.modules.budgets.api.BudgetReservePort;
import com.company.mmvsms.modules.shared.api.Money;

public final class BudgetApplicationService implements BudgetReservePort {
  @Override
  public void reserveBudget(String costCenterId, Money amount) {
    // Reserve budget for the expense.
  }

  @Override
  public void confirmReservation(String reservationId) {
    // Confirm reservation after approval.
  }
}

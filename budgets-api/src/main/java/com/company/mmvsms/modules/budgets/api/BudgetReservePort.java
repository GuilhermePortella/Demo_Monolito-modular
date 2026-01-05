package com.company.mmvsms.modules.budgets.api;

import com.company.mmvsms.modules.shared.api.Money;

public interface BudgetReservePort {
  void reserveBudget(String costCenterId, Money amount);

  void confirmReservation(String reservationId);
}

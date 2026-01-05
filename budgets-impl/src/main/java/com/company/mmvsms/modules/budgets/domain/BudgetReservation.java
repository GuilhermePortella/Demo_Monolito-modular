package com.company.mmvsms.modules.budgets.domain;

import com.company.mmvsms.modules.shared.api.Money;

public final class BudgetReservation {
  private final String id;
  private final Money amount;

  public BudgetReservation(String id, Money amount) {
    this.id = id;
    this.amount = amount;
  }

  public String id() {
    return id;
  }

  public Money amount() {
    return amount;
  }
}

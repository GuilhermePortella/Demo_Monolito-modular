package com.company.mmvsms.modules.expenses.domain;

public final class Expense {
  private final String id;
  private ExpenseStatus status;

  public Expense(String id) {
    this.id = id;
    this.status = ExpenseStatus.DRAFT;
  }

  public String id() {
    return id;
  }

  public ExpenseStatus status() {
    return status;
  }

  public void submit() {
    this.status = ExpenseStatus.SUBMITTED;
  }
}

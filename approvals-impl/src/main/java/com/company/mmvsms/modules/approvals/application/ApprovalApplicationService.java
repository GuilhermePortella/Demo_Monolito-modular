package com.company.mmvsms.modules.approvals.application;

import com.company.mmvsms.modules.approvals.api.ApprovalWorkflowPort;
import com.company.mmvsms.modules.audit.api.AuditAppendPort;
import com.company.mmvsms.modules.budgets.api.BudgetReservePort;
import com.company.mmvsms.modules.policies.api.PolicyValidationPort;
import com.company.mmvsms.modules.shared.api.Money;

public final class ApprovalApplicationService implements ApprovalWorkflowPort {
  private final PolicyValidationPort policies;
  private final BudgetReservePort budgets;
  private final AuditAppendPort audit;

  public ApprovalApplicationService(
      PolicyValidationPort policies,
      BudgetReservePort budgets,
      AuditAppendPort audit) {
    this.policies = policies;
    this.budgets = budgets;
    this.audit = audit;
  }

  @Override
  public void startWorkflow(String expenseId) {
    policies.validateExpense(expenseId, new Money(java.math.BigDecimal.ZERO, "USD"));
    budgets.confirmReservation("reservation" + expenseId);
    audit.appendEvent(expenseId, "ApprovalWorkflowStarted");
  }
}

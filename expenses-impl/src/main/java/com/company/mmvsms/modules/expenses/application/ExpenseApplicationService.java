package com.company.mmvsms.modules.expenses.application;

import com.company.mmvsms.modules.approvals.api.ApprovalWorkflowPort;
import com.company.mmvsms.modules.attachments.api.AttachmentStoragePort;
import com.company.mmvsms.modules.audit.api.AuditAppendPort;
import com.company.mmvsms.modules.budgets.api.BudgetReservePort;
import com.company.mmvsms.modules.expenses.api.ExpenseCommandPort;
import com.company.mmvsms.modules.policies.api.PolicyValidationPort;
import com.company.mmvsms.modules.shared.api.Money;

public final class ExpenseApplicationService implements ExpenseCommandPort {
  private final PolicyValidationPort policies;
  private final BudgetReservePort budgets;
  private final ApprovalWorkflowPort approvals;
  private final AttachmentStoragePort attachments;
  private final AuditAppendPort audit;

  public ExpenseApplicationService(
      PolicyValidationPort policies,
      BudgetReservePort budgets,
      ApprovalWorkflowPort approvals,
      AttachmentStoragePort attachments,
      AuditAppendPort audit) {
    this.policies = policies;
    this.budgets = budgets;
    this.approvals = approvals;
    this.attachments = attachments;
    this.audit = audit;
  }

  @Override
  public void submitExpense(String expenseId, Money total) {
    policies.validateExpense(expenseId, total);
    budgets.reserveBudget("default", total);
    attachments.registerAttachment(expenseId, "receipt.pdf");
    approvals.startWorkflow(expenseId);
    audit.appendEvent(expenseId, "ExpenseSubmitted");
  }
}

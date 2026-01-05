package com.company.mmvsms.modules.approvals.domain;

public final class ApprovalWorkflow {
  private final String id;
  private ApprovalStatus status;

  public ApprovalWorkflow(String id) {
    this.id = id;
    this.status = ApprovalStatus.PENDING;
  }

  public String id() {
    return id;
  }

  public ApprovalStatus status() {
    return status;
  }

  public void approve() {
    this.status = ApprovalStatus.APPROVED;
  }
}

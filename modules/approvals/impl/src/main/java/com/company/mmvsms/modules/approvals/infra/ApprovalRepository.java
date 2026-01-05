package com.company.mmvsms.modules.approvals.infra;

import com.company.mmvsms.modules.approvals.domain.ApprovalWorkflow;

public interface ApprovalRepository {
  void save(ApprovalWorkflow workflow);
}

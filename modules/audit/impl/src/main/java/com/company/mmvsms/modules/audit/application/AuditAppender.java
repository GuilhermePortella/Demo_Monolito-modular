package com.company.mmvsms.modules.audit.application;

import com.company.mmvsms.modules.audit.api.AuditAppendPort;

public final class AuditAppender implements AuditAppendPort {
  @Override
  public void appendEvent(String aggregateId, String type) {
    // Persist immutable audit event.
  }
}

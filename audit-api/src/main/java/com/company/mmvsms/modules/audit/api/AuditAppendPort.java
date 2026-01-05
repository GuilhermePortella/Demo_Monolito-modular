package com.company.mmvsms.modules.audit.api;

public interface AuditAppendPort {
  void appendEvent(String aggregateId, String type);
}

package com.company.mmvsms.modules.audit.infra;

import com.company.mmvsms.modules.audit.domain.AuditEvent;

public interface AuditRepository {
  void save(AuditEvent event);
}

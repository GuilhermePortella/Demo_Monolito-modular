package com.company.mmvsms.modules.audit.domain;

public final class AuditEvent {
  private final String id;
  private final String aggregateId;
  private final String type;

  public AuditEvent(String id, String aggregateId, String type) {
    this.id = id;
    this.aggregateId = aggregateId;
    this.type = type;
  }

  public String id() {
    return id;
  }

  public String aggregateId() {
    return aggregateId;
  }

  public String type() {
    return type;
  }
}

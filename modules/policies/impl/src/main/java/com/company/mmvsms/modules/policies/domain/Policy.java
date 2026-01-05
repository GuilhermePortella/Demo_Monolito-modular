package com.company.mmvsms.modules.policies.domain;

public final class Policy {
  private final String id;

  public Policy(String id) {
    this.id = id;
  }

  public String id() {
    return id;
  }
}

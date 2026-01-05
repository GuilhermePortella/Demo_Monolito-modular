package com.company.mmvsms.modules.policies.infra;

import com.company.mmvsms.modules.policies.domain.Policy;

public interface PolicyRepository {
  void save(Policy policy);
}

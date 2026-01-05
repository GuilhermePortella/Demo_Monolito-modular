package com.company.mmvsms.modules.notifications.infra;

import com.company.mmvsms.modules.notifications.domain.NotificationTask;

public interface NotificationRepository {
  void save(NotificationTask task);
}

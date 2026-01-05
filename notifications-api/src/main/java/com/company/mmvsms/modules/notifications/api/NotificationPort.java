package com.company.mmvsms.modules.notifications.api;

public interface NotificationPort {
  void notifyUser(String userId, String message);
}

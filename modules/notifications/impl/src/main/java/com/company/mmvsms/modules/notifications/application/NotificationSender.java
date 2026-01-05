package com.company.mmvsms.modules.notifications.application;

import com.company.mmvsms.modules.notifications.api.NotificationPort;

public final class NotificationSender implements NotificationPort {
  @Override
  public void notifyUser(String userId, String message) {
    // Dispatch to email or Slack.
  }
}

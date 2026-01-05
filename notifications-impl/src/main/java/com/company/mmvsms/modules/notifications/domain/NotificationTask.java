package com.company.mmvsms.modules.notifications.domain;

public final class NotificationTask {
  private final String id;
  private final String channel;

  public NotificationTask(String id, String channel) {
    this.id = id;
    this.channel = channel;
  }

  public String id() {
    return id;
  }

  public String channel() {
    return channel;
  }
}

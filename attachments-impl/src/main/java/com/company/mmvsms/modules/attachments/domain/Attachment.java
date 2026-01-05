package com.company.mmvsms.modules.attachments.domain;

public final class Attachment {
  private final String id;
  private final String filename;

  public Attachment(String id, String filename) {
    this.id = id;
    this.filename = filename;
  }

  public String id() {
    return id;
  }

  public String filename() {
    return filename;
  }
}

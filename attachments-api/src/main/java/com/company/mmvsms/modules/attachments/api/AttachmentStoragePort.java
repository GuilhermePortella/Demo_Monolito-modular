package com.company.mmvsms.modules.attachments.api;

public interface AttachmentStoragePort {
  void registerAttachment(String expenseId, String filename);
}

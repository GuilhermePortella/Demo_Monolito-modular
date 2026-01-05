package com.company.mmvsms.modules.attachments.application;

import com.company.mmvsms.modules.attachments.api.AttachmentStoragePort;

public final class AttachmentApplicationService implements AttachmentStoragePort {
  @Override
  public void registerAttachment(String expenseId, String filename) {
    // Store metadata and link to expense.
  }
}

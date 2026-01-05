package com.company.mmvsms.modules.attachments.infra;

import com.company.mmvsms.modules.attachments.domain.Attachment;

public interface AttachmentRepository {
  void save(Attachment attachment);
}

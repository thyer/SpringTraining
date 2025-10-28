package org.example.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClickTalkMessage {
  private long id;
  private String sender;
  private String recipient;
  private String content;
  private boolean isRead;
  private String attachmentUrl;
  private long timestamp;
}

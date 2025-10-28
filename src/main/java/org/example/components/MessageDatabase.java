package org.example.components;

import java.util.ArrayList;
import java.util.List;

/**
 * Interacts with the messages database which stores user messages
 */
public class MessageDatabase {
  List<ClickTalkMessage> messages = new ArrayList<>();

  public List<ClickTalkMessage> getUnreadMessages(String username) {
    return messages.stream().filter(msg -> msg.getRecipient().equals(username) && !msg.isRead()).toList();
  }

  public void addMessage(ClickTalkMessage message) {
    messages.add(message);
  }
}

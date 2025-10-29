package org.example.controllers;

import org.example.components.MessageDatabase;
import org.example.components.UserDatabase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clicktalk")
public class ClickTalkController {
  private final UserDatabase userDatabase;
  private final MessageDatabase messageDatabase;

  public ClickTalkController() {
    this.userDatabase = new UserDatabase("https://12.164.1:8080"); // nonsense IP, used for illustration only
    this.messageDatabase = new MessageDatabase();
    System.out.println("I'm entering the ClickTalkController constructor");
  }

  @GetMapping(path="/{name}")
  public ResponseEntity<String> greet(@PathVariable String name) {
    return ResponseEntity.ok("Hello, " + name + "! Welcome to ClickTalk Application!");
  }

  @PostMapping(path="/addUser/{username}")
  public ResponseEntity<String> addUser(@PathVariable String username)
  {
    return ResponseEntity.ok("Not yet implemented");
  }

  @GetMapping(path="/userExists/{username}")
  public ResponseEntity<String> userExists(@PathVariable String username)
  {
    return ResponseEntity.ok("Not yet implemented");
  }

  @GetMapping(path="/getMessages/{username}")
  public ResponseEntity<String> getMessages(@PathVariable String username)
  {
    return ResponseEntity.ok("Not yet implemented");
  }

  @PostMapping(path="/sendMessage/{sender}/{recipient}/{content}")
  public ResponseEntity<String> sendMessage(@PathVariable String sender, @PathVariable String recipient, @PathVariable String content) {
    return ResponseEntity.ok("Not yet implemented");
  }

  @PostMapping(path="/markAsRead/{messageId}")
  public ResponseEntity<String> markAsRead(@PathVariable long messageId) {
    return ResponseEntity.ok("Not yet implemented");
  }
}

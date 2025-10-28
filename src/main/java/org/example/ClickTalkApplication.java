package org.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClickTalkApplication implements ApplicationRunner {
  public static void main(String[] args) {
    SpringApplication.run(ClickTalkApplication.class, args);
  }

  @Override
  public void run(ApplicationArguments args) {
    System.out.println("Welcome to ClickTalk Application!");
  }
}
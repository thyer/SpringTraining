package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {
  @Bean
  public String connectionString(){
    return "https://12.164.1:8080";
  }
}

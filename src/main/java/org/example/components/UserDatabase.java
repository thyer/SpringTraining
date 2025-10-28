package org.example.components;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

public class UserDatabase {
  private final Set<String> users = new HashSet<>();
  @Getter
  private final String connectionString;

  public UserDatabase(String connectionString) {
    this.connectionString = connectionString;
  }

  public boolean addUser(String username) {
    return users.add(username);
  }
  public boolean removeUser(String username) { return users.remove(username); }
  public boolean userExists(String username) {
    return users.contains(username);
  }

  public Set<String> getAllUsers() {
    return new HashSet<>(users);
  }
}

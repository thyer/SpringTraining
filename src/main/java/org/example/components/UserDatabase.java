package org.example.components;

import java.util.HashSet;
import java.util.Set;

public class UserDatabase {
  private Set<String> users = new HashSet<>();
  private final String connectionString;

  public UserDatabase(String connectionString) {
    this.connectionString = connectionString;
  }

  public boolean addUser(String username) {
    return users.add(username);
  }

  public boolean userExists(String username) {
    return users.contains(username);
  }

  public Set<String> getAllUsers() {
    return new HashSet<>(users);
  }

  public String getConnectionString() {
    return connectionString;
  }
}

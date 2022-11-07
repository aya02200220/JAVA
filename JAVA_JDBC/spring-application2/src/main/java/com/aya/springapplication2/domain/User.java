package com.aya.springapplication2.domain;

public class User {

  private String User;
  private String fullName;
  private int age;
  
  public User(){};
  public User(String user, String fullName, int age) {
    User = user;
    this.fullName = fullName;
    this.age = age;
  }

  public String getUser() {
    return User;
  }

  public void setUser(String user) {
    User = user;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
  


  
}

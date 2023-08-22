package com.example.android02_activities;

import java.io.Serializable;

public class Student implements Serializable {
  private String name;
  private int birthday;
  private boolean gender;

  public Student(String name, int birthday, boolean gender) {
    this.name = name;
    this.birthday = birthday;
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", birthday=" + birthday +
      ", gender=" + (gender?"Nam":"Nữ") +
      '}';
  }
}

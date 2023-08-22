package com.example.android02_activities;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;

public class Students implements Serializable {
  private ArrayList<Student> students;

  public Students() {
    this.students = new ArrayList<>();
  }
  public void addStudent(Student st){
    this.students.add(st);
  }

  @NonNull
  @Override
  public String toString() {
    String result = "";
    for(Student st:this.students)
      result += st + "\n";
    return result;
  }
}

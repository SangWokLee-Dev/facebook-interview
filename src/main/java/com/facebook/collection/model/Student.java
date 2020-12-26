package com.facebook.collection.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
  int rollno;
  String name, address;

  public Student(int rollno, String name, String address) {
    this.rollno = rollno;
    this.name = name;
    this.address = address;
  }

  public String toString() {
    return this.rollno + " " + this.name + " " + this.address;
  }

  static class Sortbyroll implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
      System.out.println(b.rollno - a.rollno);
      return b.rollno - a.rollno;
    }
  }

  static class Sortbyname implements Comparator<Student> {
    // Used for sorting in ascending order of
    // name
    public int compare(Student a, Student b) {
      System.out.println(a.name.compareTo(b.name));
      return a.name.compareTo(b.name);
    }
  }

  static class Main {
    public static void main(String[] args) {
      ArrayList<Student> ar = new ArrayList<>();
      ar.add(new Student(111, "bbbb", "london"));
      ar.add(new Student(131, "aaaa", "nyc"));
      ar.add(new Student(121, "cccc", "jaipur"));

      System.out.println("Unsorted");
      for (int i = 0; i < ar.size(); i++) {
        System.out.println(ar.get(i));
      }

      Collections.sort(ar, new Sortbyroll());
      System.out.println("\nSorted by rollno");
      for (int i = 0; i < ar.size(); i++) System.out.println(ar.get(i));

      Collections.sort(ar, new Sortbyname());

      System.out.println("\nSorted by name");
      for (int i = 0; i < ar.size(); i++) System.out.println(ar.get(i));
    }
  }
}

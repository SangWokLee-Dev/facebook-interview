package com.facebook.collection.model;

import java.time.LocalDate;

/**
 * Java Comparable interface used to sort a array or list of objects based on their natural order.
 * Natural ordering of elements is imposed by implementing it's compareTo() method in the objects.
 * Comparable.java public interface Comparable<T> { public int compareTo(T o); }
 */
public class Employee implements Comparable<Employee> {

  private Long id;
  private String name;
  private LocalDate dob;

  public Employee(Long id, String name, LocalDate dob) {
    this.id = id;
    this.name = name;
    this.dob = dob;
  }

  @Override
  public int compareTo(Employee o) {
    return this.getId().compareTo(o.getId());
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
  }
}

package com.facebook.population;

/** Person with birth and death year */
public class Person {
  private int birthYear;
  private int deathYear;

  public Person(int birthYear, int deathYear) {
    this.birthYear = birthYear;
    this.deathYear = deathYear;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public int getDeathYear() {
    return deathYear;
  }
}

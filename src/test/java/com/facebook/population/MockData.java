package com.facebook.population;

import java.util.List;
import java.util.ArrayList;

public class MockData {

  public static List<Person> getPeople() {
    List<Person> people = new ArrayList<>();
    for (int index = 0; index < 10000000; index++) {
      int yearOfBirth = getRandomNumberInRange(1900, 2020);
      int yearOfDeath = yearOfBirth + getRandomNumberInRange(1, 70);
      people.add(new Person(yearOfBirth, yearOfDeath));
    }
    return people;
  }

  private static int getRandomNumberInRange(int min, int max) {

    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }

    return (int) (Math.random() * ((max - min) + 1)) + min;
  }
}

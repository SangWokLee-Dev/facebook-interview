package com.facebook.population;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class PopulationFinder {

  public static int findYearWithHighestPopulation(List<Person> people) {
    long start = System.currentTimeMillis();
    Map<Integer, Integer> yearCounts = new HashMap<>();

    int mostPopulatedYear = 0;

    for (Person person : people) {

      for (int year = person.getBirthYear(); year < person.getDeathYear(); year++) {

        // increment year (or set value to 1 if not yet present)
        yearCounts.merge(year, 1, Integer::sum);

        // check/set most populated year
        // if a most populated year does not yet exist, or this year is higher
        if (mostPopulatedYear == 0 || yearCounts.get(year) > yearCounts.get(mostPopulatedYear)) {
          // set this year
          mostPopulatedYear = year;
        }
      }
    }
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("time elapsed with ON^2: " + timeElapsed);
    return mostPopulatedYear;
  }
}

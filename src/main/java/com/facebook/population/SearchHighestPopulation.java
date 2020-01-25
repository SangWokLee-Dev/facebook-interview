package com.facebook.population;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/** SearchHighestPopulation searches highest population years */
public class SearchHighestPopulation {
  private int highestPopulationYear;

  private SearchHighestPopulation(int highestPopulationYear) {
    this.highestPopulationYear = highestPopulationYear;
  }

  public static SearchHighestPopulation searchHighestPopulationYear(List<Person> people) {
    TreeMap<Integer, Integer> birthYearMap = new TreeMap<>();
    TreeMap<Integer, Integer> deathYearMap = new TreeMap<>();

    // Time complexity O(P)
    people.forEach(
        person -> {
          int yearOfBirth = person.getBirthYear();
          int yearOfDeath = person.getDeathYear();
          if (!birthYearMap.containsKey(yearOfBirth)) {
            birthYearMap.put(yearOfBirth, 1);
          } else {
            birthYearMap.put(yearOfBirth, birthYearMap.get(yearOfBirth) + 1);
          }

          if (!deathYearMap.containsKey(yearOfDeath)) {
            deathYearMap.put(yearOfDeath, 1);
          } else {
            deathYearMap.put(yearOfDeath, deathYearMap.get(yearOfDeath) + 1);
          }
        });

    Map<Integer, Integer> populationYearMap = new HashMap<>();
    int population = 0;
    int startingYear = birthYearMap.firstKey();
    int endYear = birthYearMap.lastKey();
    // Increasing the time complexity O(P + Y)
    for (int index = startingYear; index <= endYear; index++) {

      if (birthYearMap.containsKey(index)) {
        population += birthYearMap.get(index);
      }

      if (deathYearMap.containsKey(index)) {
        population -= deathYearMap.get(index);
      }
      populationYearMap.put(index, population);
    }
    int populationCompare = 0;
    // Increasing the time complexity O (P + Y + E)
    for (Map.Entry<Integer, Integer> populationEntry : populationYearMap.entrySet()) {
      if (populationEntry.getValue() > populationCompare) {
        populationCompare = populationEntry.getValue();
        startingYear = populationEntry.getKey();
      }
    }
    return new SearchHighestPopulation(startingYear);
  }

  public int getHighestPopulationYear() {
    return highestPopulationYear;
  }
}

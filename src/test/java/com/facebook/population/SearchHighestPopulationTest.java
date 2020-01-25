package com.facebook.population;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchHighestPopulationTest {
  private static List<Person> mockedData = MockData.getPeople();
  private static List<Person> data1 = mockedData;
  private static List<Person> data2 = mockedData;

  @Test
  @DisplayName("Successfully search highest population year with O(N+P+E)")
  public void testHighestPopulationYearON() {
    SearchHighestPopulation searchHighestPopulation =
        SearchHighestPopulation.searchHighestPopulationYear(data1);
    long start = System.currentTimeMillis();
    int year = searchHighestPopulation.getHighestPopulationYear();
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("time elapsed with ON: " + timeElapsed);
    System.out.println(year);
  }

  @Test
  @DisplayName("Successfully search highest population year with O(N^2)")
  public void testHighestPopulationYearOSquaredN() {
    long start = System.currentTimeMillis();
    int year = PopulationFinder.findYearWithHighestPopulation(data2);
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("time elapsed with ON^2: " + timeElapsed);
    System.out.println(year);
  }
}

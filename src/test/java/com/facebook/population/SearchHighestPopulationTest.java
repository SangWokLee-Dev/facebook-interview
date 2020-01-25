package com.facebook.population;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchHighestPopulationTest {

  @Test
  @DisplayName("Successfully search highest population year with O(N+P+E)")
  public void testHighestPopulationYearON() {
    List<Person> mockedData = MockData.getPeople();
    SearchHighestPopulation searchHighestPopulation =
        SearchHighestPopulation.searchHighestPopulationYear(mockedData);
    long start = System.currentTimeMillis();
    searchHighestPopulation.getHighestPopulationYear();
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println(timeElapsed);
  }

  @Test
  @DisplayName("Successfully search highest population year with O(N^2)")
  public void testHighestPopulationYearOSquaredN() {
    List<Person> mockedData = MockData.getPeople();
    long start = System.currentTimeMillis();
    PopulationFinder.findYearWithHighestPopulation(mockedData);
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println(timeElapsed);
  }
}

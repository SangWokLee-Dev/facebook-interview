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

    int year = searchHighestPopulation.getHighestPopulationYear();

    System.out.println(year);
  }

  @Test
  @DisplayName("Successfully search highest population year with O(N^2)")
  public void testHighestPopulationYearOSquaredN() {

    int year = PopulationFinder.findYearWithHighestPopulation(data2);

    System.out.println(year);
  }
}

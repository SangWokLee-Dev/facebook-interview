package com.facebook.population;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchHighestPopulationTest {
  private static List<Person> mockedData = MockData.getPeople();

  @Test
  @DisplayName("Successfully search highest population year with O(N+P+E)")
  public void testHighestPopulationYearON() {
    SearchHighestPopulation searchHighestPopulation =
        SearchHighestPopulation.searchHighestPopulationYear(mockedData);

    int year = searchHighestPopulation.getHighestPopulationYear();

    System.out.println(year);
  }
}

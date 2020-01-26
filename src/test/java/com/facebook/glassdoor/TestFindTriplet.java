package com.facebook.glassdoor;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFindTriplet {
  private static final int[] mockedData = MockedArray.generateMock(1000);
  private static final int[] duplicate1 = mockedData;
  private static final int[] duplicate2 = mockedData;

  @Test
  @DisplayName("successfully finds triplets")
  public void testFindTriplet() {

    List<List<Integer>> list = FindTriplet.findTriplets(duplicate1, 1000);
    List<List<Integer>> lists = FindTriplet.findTripletsWithONSquared(duplicate2, 1000);
  }
}

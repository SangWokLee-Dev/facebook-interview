package com.facebook.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

  @Test
  @DisplayName("Binary Search successfully searches data and returns integer")
  public void testBinarySearch() {
    int[] arr = {1, 3, 6, 10, 13, 16, 18, 30, 70, 80};
    BinarySearch.search(arr, 0, 9, 16);
    Integer expectedSearchedData = BinarySearch.getSearchedData();
    System.out.println(expectedSearchedData);
  }
}

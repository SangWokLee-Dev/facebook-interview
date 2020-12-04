package com.facebook.algorithm;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

  @Test
  @Description("Test binary search algorithm used for array with odd number of elements")
  public void testBinarySearchOddNumOfElements() {
    int arr[] = {2, 3, 4, 10, 40};
    int result = BinarySearch.binarySearch(arr, 0, arr.length - 1, 10);
    int expected = 10;

    System.out.println("Result of / operator: " + (5 / 2));
    assertEquals(expected, result);
  }

  @Test
  @Description("Test binary search algorithm used for array with even number of elements")
  public void testBinarySearchEvenNumOfElements() {
    int arr[] = {2, 3, 10, 40};
    int result = BinarySearch.binarySearch(arr, 0, arr.length - 1, 10);
    int expected = 10;
    assertEquals(expected, result);
  }
}

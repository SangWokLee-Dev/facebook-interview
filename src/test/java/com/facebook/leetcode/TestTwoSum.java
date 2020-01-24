package com.facebook.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTwoSum {

  @Test
  @DisplayName("The function should find the array that can be sumed to element that is specified")
  public void testTwoSum() {
    int[] arr = {2, 7, 11, 15};
    int target = 9;
    int[] targetIndexes = TwoSum.findTwoSumBruteForce(arr, target);
    assertEquals(1, targetIndexes[0]);
    assertEquals(0, targetIndexes[1]);
  }
}

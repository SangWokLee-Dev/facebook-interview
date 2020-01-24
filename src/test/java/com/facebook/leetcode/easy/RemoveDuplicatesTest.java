package com.facebook.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {

  @Test
  @DisplayName("Successfully remove duplicates from array")
  public void testRemoveDuplicates() {
    int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int expectedVal = 5;

    assertEquals(expectedVal, RemoveDuplicatesArray.removeDuplicates(arr));
  }
}

package com.facebook.algorithm;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

  @Test
  @Description("Test bubble sort algorithm")
  public void testBubbleSortAlg() {
    int[] arr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
    BubbleSort.bubbleSort(arr);

    assertEquals(arr[0], 7);
    assertEquals(arr[1], 9);
    assertEquals(arr[2], 10);
    assertEquals(arr[3], 12);
  }
}

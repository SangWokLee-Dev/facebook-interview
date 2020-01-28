package com.facebook.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContainerWIthMostWaterTest {

  @Test
  @DisplayName("container with most water")
  public void testContainerWithMostWater() {
    int input[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    assertEquals(49, ContainerWithMostWater.maxArea(input));
  }

  @Test
  @DisplayName("container with most water optimised")
  public void testContainerWithMostWaterOptimized() {
    int input[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    assertEquals(49, ContainerWithMostWater.maxAreaOptimised(input));
  }
}

package com.facebook.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
  @Test
  @DisplayName("Successfully reverse String value")
  public void testReverseInteger() {
    int experiment = 333;
    int x = 3232;
    int pop = x % 10;
    System.out.println(pop);
    System.out.println(x /= 10);
    System.out.println(ReverseString.reverseString("adb"));
  }
}

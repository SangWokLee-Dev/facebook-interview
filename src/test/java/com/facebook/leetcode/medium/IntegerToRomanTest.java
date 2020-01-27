package com.facebook.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

  @Test
  @DisplayName("Converting integer to roman")
  public void testIntegerToRoman() {
    int input = 1994;
    String output = "MCMXCIV";

    assertEquals(output, IntegerToRoman.convert(input));
  }
}

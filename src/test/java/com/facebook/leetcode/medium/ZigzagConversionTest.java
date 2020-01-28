package com.facebook.leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ZigzagConversionTest {

  @Test
  @DisplayName("zig zag conversion")
  public void testZigZagConversion() {

    String input = "PAYPALISHIRING";
    int numRows = 3;
    System.out.println(ZigzagConversion.convert(input, numRows));
  }
}

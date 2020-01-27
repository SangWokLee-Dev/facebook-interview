package com.facebook.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {

  @Test
  @DisplayName("Convert Roman to Integer")
  public void testRomanToInteger() {
    String input1 = "III";
    String input2 = "IV";
    String input3 = "IX";
    String input4 = "LVIII";
//    assertEquals(RomanToInt.romanToInt(input1), 3);
//    assertEquals(RomanToInt.romanToInt(input2), 4);
//    assertEquals(RomanToInt.romanToInt(input3), 9);
    assertEquals(RomanToInt.romanToInt(input4), 58);

  }
}

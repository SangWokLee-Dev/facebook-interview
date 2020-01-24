package com.facebook.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
  @Test
  @DisplayName("Testing palindrome number")
  public void testPalindrome() {
    boolean truth = IntegerPalindrome.integerPalindrome(122);

    assertEquals(true, truth);
  }
}

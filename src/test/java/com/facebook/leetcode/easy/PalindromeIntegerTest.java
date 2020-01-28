package com.facebook.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeIntegerTest {

  @Test
  @DisplayName("Validate integer palindrome")
  public void testIntegerPalindrome() {
    int input = 2442;
    assertEquals(true, PalindromeInteger.isPalindrome(input));
  }

  @Test
  @DisplayName("Validate invalid integer palindrome")
  public void testInvalidIntegerPalindrome() {
    int input = 123;
    assertEquals(false, PalindromeInteger.isPalindrome(input));
  }
}

package com.facebook.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubStringTest {
  private static final String palindromeData = "babad";

  @Test
  @DisplayName("Searches the longest palindrome")
  public void testLongestPalindromicSubString() {
    assertEquals("aba", LongestPalindromicSubString.longestPalindrome(palindromeData));

  }
}

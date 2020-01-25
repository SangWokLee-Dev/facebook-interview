package com.facebook.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LengthOfLongestSubstringTest {

  @Test
  @DisplayName("Successfully finds longest substring")
  public void testLengthOfLongestSubString() {
    String mock = "pwwkew";
    assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring(mock));
  }
}

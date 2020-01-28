package com.facebook.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

  @Test
  @DisplayName("Longest Common Prefix")
  public void testLongestCommonPrefixHorizontal() {
    String[] input1 = {"flower", "flow", "flight"};
    String[] input2 = {"dog", "racecar", "car"};
    assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(input1));
    assertEquals("", LongestCommonPrefix.longestCommonPrefix(input2));
  }

  @Test
  @DisplayName("Longest Common Prefix Vertical Scanning")
  public void testLongestCommonPrefixVertical() {
    String[] input1 = {"flower", "flow", "flight"};
    String[] input2 = {"dog", "racecar", "car"};
    assertEquals("fl", LongestCommonPrefix.longestCommonPrefixVerticalScanning(input1));
    assertEquals("", LongestCommonPrefix.longestCommonPrefixVerticalScanning(input2));
  }

  @Test
  @DisplayName("Finding the common prefix between left and right")
  public void testFindCommonPrefix() {
    assertEquals("fl", LongestCommonPrefix.commonPrefix("flight", "flow"));
  }
}

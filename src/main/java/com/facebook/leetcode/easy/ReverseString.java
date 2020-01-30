package com.facebook.leetcode.easy;

public class ReverseString {

  /**
   * reverseString reverse string O(N) time and O(N) space complexity
   *
   * @param data
   * @return
   */
  public static String reverseString(String data) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int strIndex = 0; strIndex < data.length(); strIndex++) {
      stringBuilder.append(data.charAt(data.length() - strIndex - 1));
    }
    return stringBuilder.toString();
  }
}

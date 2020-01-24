package com.facebook.leetcode.easy;

public class IntegerPalindrome {

  /**
   *
   * @param data
   * @return
   */
  public static boolean integerPalindrome(int data) {
    int absoluteData = data > 0 ? data : -data;
    int rev = 0;
    while (absoluteData != 0) {
      int pop = absoluteData % 10;
      absoluteData /= 10;

      rev = rev * 10 + pop;
    }
    return rev == data;
  }
}

package com.facebook.leetcode.easy;

/** ReverseInteger reverses integer value */
public class ReverseInteger {

  /**
   * @param x - value of data that is being reversed
   * @return value of reversed integer 321 123 Integer overflows in java
   */
  public static int reverseInteger(int x) {
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
      if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
      rev = rev * 10 + pop;
    }

    return rev;
  }
}

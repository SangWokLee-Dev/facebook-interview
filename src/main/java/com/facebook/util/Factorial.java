package com.facebook.util;

public class Factorial {
  public static int calculate(int n) {
    // If n is 1 then return 1
    if (n <= 1) {
      return 1;
    } else {
      // If not recursive function.
      System.out.println(n);
      return calculate(n * calculate(n - 1));
    }
  }
}

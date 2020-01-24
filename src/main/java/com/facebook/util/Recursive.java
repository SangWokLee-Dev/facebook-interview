package com.facebook.util;

public class Recursive {

  public static void recursive(int n) {
    // If n is 1 then return 1
    if (n == 1) {
      System.out.println("recursion at 1");
      // If recursion is not 1 then
    } else {
      System.out.println("recursion at " + n);
      recursive(n - 1);
    }
  }
}

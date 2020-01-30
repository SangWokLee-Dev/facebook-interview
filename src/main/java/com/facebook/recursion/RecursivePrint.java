package com.facebook.recursion;

public class RecursivePrint {

  public static void recursive(int n) {
    if (n == 0) {
      System.out.println("This recursion has finished");

    } else {
      System.out.println("Current recursion number is: " + n);
      recursive(n - 1);
    }
  }


}

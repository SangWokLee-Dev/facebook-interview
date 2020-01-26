package com.facebook.common;

/** Factorial computes factorial */
public class Factorial {

  public static int findFactorial(int factorial) {
    if (factorial < 1) {
      return 1;
    }

    return factorial * findFactorial(factorial - 1);
  }
}

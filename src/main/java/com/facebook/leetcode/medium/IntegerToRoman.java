package com.facebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
  private static Map<String, Integer> romanMap =
      new HashMap<String, Integer>() {
        {
          put("I", 1);
          put("V", 5);
          put("X", 10);
          put("L", 50);
          put("C", 100);
          put("D", 500);

        }
      };

  /**
   * convert translates integer to Roman
   *
   * @param input - Input
   * @return - Roman
   */
  public static String convert(int input) {
    return null;
  }
}

package com.facebook.leetcode.medium;

public class ZigzagConversion {
  /**
   * @param s
   * @param numRows
   * @return
   */
  public static String convert(String s, int numRows) {

    if (numRows == 1) return s;

    StringBuilder ret = new StringBuilder();
    int n = s.length();
    int cycleLen = 2 * numRows - 2;

    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j + i < n; j += cycleLen) {
        ret.append(s.charAt(j + i));
        if (i != 0 && i != numRows - 1 && j + cycleLen - i < n){
          char thisVal =s.charAt(j + cycleLen - i);
          System.out.println(j + cycleLen - i);
          System.out.println(thisVal);
          ret.append(thisVal);
        }
      }
    }
    return ret.toString();
  }
}

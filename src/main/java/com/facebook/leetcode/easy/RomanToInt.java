package com.facebook.leetcode.easy;

/** */
public class RomanToInt {
  public static int romanToInt(String s) {
    if (s == null) {
      return 0;
    }
    int length = s.length();
    int sum = 0;
    int pre = 0;
    for (int index = length - 1; index >= 0; index--) {
      int current = romanToInt(s.charAt(index));
      System.out.println("Pre: " + pre);
      System.out.println("Current: " + current);

      if (index == length - 1) {
        sum = sum + current;
      } else {
        if (current < pre) {
          sum = sum - current;
        } else {
          sum = sum + current;
        }
      }
      pre = current;
    }
    return sum;
  }

  private static int romanToInt(char c) {
    int num = 0;
    switch (c) {
      case 'I':
        num = 1;
        break;
      case 'V':
        num = 5;
        break;
      case 'X':
        num = 10;
        break;
      case 'L':
        num = 50;
        break;
      case 'C':
        num = 100;
        break;
      case 'D':
        num = 500;
        break;
      case 'M':
        break;
      default:
        num = 0;
        break;
    }
    return num;
  }
}

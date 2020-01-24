package com.facebook.leetcode.easy;

public class StringPalindrome {

  public static boolean findPalindrome(String palindrome) {

    StringBuilder stringBuilder = new StringBuilder();
    for (int index = 0; index < palindrome.length(); index++) {
      stringBuilder.append(palindrome.charAt(palindrome.length() - index - 1));
    }

    return stringBuilder.toString().equals(palindrome);
  }
}

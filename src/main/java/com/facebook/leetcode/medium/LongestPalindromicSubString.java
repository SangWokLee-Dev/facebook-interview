package com.facebook.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubString {
  public static String longestPalindrome(String str) {
    int strSize = str.length();
    String palindrome = "";
    if (strSize == 0) {
      return palindrome;
    }

    Set<String> palindromeSets = new HashSet<>();
    // O(N^2) time complexity
    for (int index = 0; index < strSize; index++) {
      System.out.println("outer Index: " + index);
      for (int nextIndex = index + 1; nextIndex < strSize - index + 1; nextIndex++) {

        System.out.println("inner Index: " + nextIndex);
        palindromeSets.add(str.substring(index, nextIndex));
      }
    }

    System.out.println(palindromeSets);

    // O(N^2) time complexity
    for (String nextPalindrome : palindromeSets) {
      if (isPalindrome(nextPalindrome)) {
        int palindromeSize = palindrome.length();
        int nextPalindromeSize = nextPalindrome.length();
        if (nextPalindromeSize > palindromeSize) {
          palindrome = nextPalindrome;
        }
      }
    }
    return palindrome;
  }

  private static boolean isPalindrome(String str) {
    int storedStrLength = str.length();
    //    int mid = (storedStrLength - 1) / 2;
    StringBuilder stringBuilder = new StringBuilder();

    for (int index = storedStrLength - 1; index >= 0; index--) {
      stringBuilder.append(str.charAt(index));
    }

    if (stringBuilder.toString().equals(str)) {
      return true;
    }

    return false;
  }
}

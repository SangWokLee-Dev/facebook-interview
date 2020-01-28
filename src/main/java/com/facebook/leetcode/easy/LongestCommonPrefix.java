package com.facebook.leetcode.easy;

public class LongestCommonPrefix {

  /**
   * Horizontal scanning For a start we will describe a simple way of finding the longest prefix
   * shared by a set of strings LCP(S1,..., Sn). We will use the observation that: LCP(S1, ... Sn) =
   * LCP(LCP(LCP(S1,S2),S3),...Sn) Algorithm
   *
   * <p>To employ this idea, the algorithm iterates through the strings [S1, ..., Sn], finding at
   * east iteration i the longest common prefix of strings LCP(S1,...,Si) when LCP(S1,...Si) is an
   * empty string, the algorithm ends. Otherwise after n iterations, the algorithm returns
   * LCP(S1,...,Sn).
   *
   * @param strs
   * @return
   */
  public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int index = 1; index < strs.length; index++) {
      // Pop the last element
      while (strs[index].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    }
    return prefix;
  }

  /**
   * Vertical scanning Algorithm - Imagine a very short string is at the end of the array. The above
   * approach will still do S comparisons. One way to optimize this case is to do vertical scanning.
   * We compare characters from top to bottom on the same column (same character index of strings)
   * before moving on to the next column.
   *
   * <p>Time complexity: O(S), where S is the sum of all characters in all strings. In the worst
   * case there will be n equal strings with length m and the algorithm performs S=m*n character
   * comparisons.
   *
   * @param strs
   * @return
   */
  public static String longestCommonPrefixVerticalScanning(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int index = 0; index < strs[0].length(); index++) {
      char c = strs[0].charAt(index);
      for (int j = 1; j < strs.length; j++) {
        System.out.println(c);
        if (index == strs[j].length() || strs[j].charAt(index) != c)
          return strs[0].substring(0, index);
      }
    }
    return strs[0];
  }

//  public static String longestCommonPrefixDivideAndConquer(String[] strs) {}


  /**
   * commonPrefix finds
   * @param left
   * @param right
   * @return
   */
  public static String commonPrefix(String left, String right) {
    int min = Math.min(left.length(), right.length());
    for (int index = 0; index < min; index++) {
      if (left.charAt(index) != right.charAt(index)) return left.substring(0, index);
    }
    return left.substring(0, min);
  }
}

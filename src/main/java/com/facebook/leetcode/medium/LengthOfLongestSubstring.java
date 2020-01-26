package com.facebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

  /**
   * lengthOfLongestSubstring searches the length of the longest substring value
   *
   * @param s
   * @return
   */
  public static int lengthOfLongestSubstring(String s) {

    int strSize = s.length();
    Map<Character, Integer> characterMap = new HashMap<>();
    int answer = 0;
    int indexComparer = 0;
    for (int index = 0; index < strSize; index++) {
      char currentChar = s.charAt(index);
      if (characterMap.containsKey(currentChar)) {
        indexComparer = Math.max(index, characterMap.get(currentChar));
      }
      characterMap.put(currentChar, index);
      answer = Math.max(answer, index - indexComparer + 1);
    }

    return answer;
  }
}

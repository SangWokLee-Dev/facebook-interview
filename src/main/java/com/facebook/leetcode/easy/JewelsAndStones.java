package com.facebook.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * You're given string J representing the types of stones that are jewels, and S representing the
 * stones you have. Each character in S is a type of stone you have. You want to know how many of
 * the stones you have are also jewels.
 *
 * <p>The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters
 * are case sensitive, so "a" is considered a differenty type of stone from "A".
 */
public class JewelsAndStones {
  public int numJewelsInStones(String J, String S) {
    Set<String> jewelsSet = new HashSet<>();
    int result = 0;
    for (int i = 0; i < J.length(); i++) {
      String jewels = String.valueOf(J.charAt(i));
      if (!jewelsSet.contains(jewels)) {
        jewelsSet.add(jewels);
      }
    }

    for (int j = 0; j < S.length(); j++) {
      String stones = String.valueOf(S.charAt(j));
      if (jewelsSet.contains(stones)) {
        result++;
      }
    }
    return result;
  }
}

package com.facebook.leetcode.easy;

public class OneBitTwoBitCharacter {
  public boolean isOneBitCharacterSolOne(int[] bits) {
    int i = 0;
    while (i < bits.length - 1) {
      i += bits[i] + 1;
    }
    return i == bits.length - 1;
  }

  public boolean isOneBitCharacterSolTwo(int[] bits) {
    int i = bits.length - 2;
    while (i >= 0 && bits[i] > 0) i--;
    return (bits.length - i) % 2 == 0;
  }


}

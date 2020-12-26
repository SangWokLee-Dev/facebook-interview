package com.facebook.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneBitTwoBitCharacterTest {

  @Test
  public void testExampleOne() {
    int[] bits = {1, 0, 0};

    OneBitTwoBitCharacter oneBitTwoBitCharacter = new OneBitTwoBitCharacter();

    assertEquals(true, oneBitTwoBitCharacter.isOneBitCharacterSolOne(bits));
  }

  @Test
  public void testExampleTwo() {
    int[] bits = {1, 0, 0, 0};

    OneBitTwoBitCharacter oneBitTwoBitCharacter = new OneBitTwoBitCharacter();

    assertEquals(true, oneBitTwoBitCharacter.isOneBitCharacterSolOne(bits));
  }

  @Test
  public void testExampleThird() {
    int[] bits = {1, 1, 0};

    OneBitTwoBitCharacter oneBitTwoBitCharacter = new OneBitTwoBitCharacter();

    assertEquals(true, oneBitTwoBitCharacter.isOneBitCharacterSolOne(bits));
  }

  @Test
  public void testExampleFourth() {
    int[] bits = {0, 1, 0, 0};

    OneBitTwoBitCharacter oneBitTwoBitCharacter = new OneBitTwoBitCharacter();

    assertEquals(true, oneBitTwoBitCharacter.isOneBitCharacterSolOne(bits));
  }
}

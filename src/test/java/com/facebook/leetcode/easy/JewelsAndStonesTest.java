package com.facebook.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStonesTest {

  @Test
  public void testJewelsAndStonesExampleOne() {
    String j = "aA";
    String s = "aAAbbbb";

    JewelsAndStones jewelsAndStones = new JewelsAndStones();

    assertEquals(3, jewelsAndStones.numJewelsInStones(j, s));
  }

  @Test
  public void testJewelsAndStonesExampleTwo() {
    String j = "z";
    String s = "ZZ";

    JewelsAndStones jewelsAndStones = new JewelsAndStones();

    assertEquals(0, jewelsAndStones.numJewelsInStones(j, s));
  }
}

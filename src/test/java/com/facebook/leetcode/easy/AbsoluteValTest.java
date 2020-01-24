package com.facebook.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.facebook.common.AbsoluteVal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AbsoluteValTest {

  @Test
  @DisplayName("Successfully test absolute Value")
  public void testAbsoluteVal() {
    int abosoluteVal = AbsoluteVal.absolute(-1);
    assertEquals(abosoluteVal, 1);
  }
}

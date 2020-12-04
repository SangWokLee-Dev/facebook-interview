package com.facebook.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumOfStepsToReduceNumToZeroTest {

  @Test
  public void setNumOfStepsToReduceNumToZeroTestExampleOne() {
    int num = 14;
    NumOfStepsToReduceNumToZero numOfStepsToReduceNumToZero = new NumOfStepsToReduceNumToZero();
    assertEquals(6, numOfStepsToReduceNumToZero.numberOfSteps(num));
  }

  @Test
  public void setNumOfStepsToReduceNumToZeroTestExampleTwo() {
    int num = 8;
    NumOfStepsToReduceNumToZero numOfStepsToReduceNumToZero = new NumOfStepsToReduceNumToZero();
    assertEquals(4, numOfStepsToReduceNumToZero.numberOfSteps(num));
  }
}

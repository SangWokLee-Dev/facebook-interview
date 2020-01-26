package com.facebook.common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialTest {

  @Test
  @DisplayName("Successfully computes factorial")
  public void testFactorial() {
    System.out.println(Factorial.findFactorial(3));
  }
}

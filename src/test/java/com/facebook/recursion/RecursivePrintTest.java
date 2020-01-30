package com.facebook.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecursivePrintTest {

  @Test
  @DisplayName("This is a recursive function")
  public void testRecursivePrint() {
    RecursivePrint.recursive(10);
  }
}

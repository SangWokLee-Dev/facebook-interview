package com.facebook.data_structure.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomStackTest {
  private static final int stackSize = 10;

  @Test
  @DisplayName("Custom Stack Test")
  public void testCustomStack() {
    CustomStack customStack = new CustomStack(stackSize);

    customStack.push(10);
    customStack.push(10);
    customStack.push(10);
    customStack.push(10);
    customStack.inspectStack();
    customStack.pop();
    customStack.inspectStack();
  }
}

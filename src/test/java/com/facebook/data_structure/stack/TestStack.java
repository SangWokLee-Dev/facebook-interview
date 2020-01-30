package com.facebook.data_structure.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestStack {

  @Test
  @DisplayName("Successfully implemnted stack")
  public void testStack() {
    Stack stack = new Stack();

    stack.push(3);
    stack.push(4);
    stack.push(6);
    stack.pop();

    int[] arr = stack.getStack();

    System.out.println(arr[3] + "is stack popped? ");

    int arrSize = arr.length;
    for (int index = 0; index < arrSize; index++) {
      System.out.println(arr[index]);
    }

    System.out.println(stack.pop() + "Popped from stack");
  }
}

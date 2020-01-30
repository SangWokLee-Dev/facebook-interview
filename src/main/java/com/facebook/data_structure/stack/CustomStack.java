package com.facebook.data_structure.stack;

public class CustomStack {
  private int arrSize;
  int[] arr;
  int top = 0;

  public CustomStack(int arrSize) {
    setArrSize(arrSize);
    arr = new int[arrSize];
  }

  public void push(int data) {
    if (top + 1 < arrSize) {
      arr[top] = data;
      top++;
    }
  }

  public void pop() {
    if (top - 1 >= 0) {
      arr[top] = 0;
      top--;
    }
  }

  public void inspectStack() {
    for (int index = 0; index < top; index++) {
      System.out.println(arr[index]);
    }
  }

  public void setArrSize(int arrSize) {
    this.arrSize = arrSize;
  }
}

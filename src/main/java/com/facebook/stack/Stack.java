package com.facebook.stack;

public class Stack {
  static final int MAX = 1000;
  int top;
  int a[] = new int[MAX];

  public Stack() {}

  public boolean push(int x) {
    if (top >= MAX - 1) {
      System.out.println("Stack Overflow");
      return false;
    } else {
      a[++top] = x;
      System.out.println(x + " pushed into the stack");
      return true;
    }
  }

  public int pop() {
    if (top < 0) {

      System.out.println("Stack Underflow");
      return 0;
    } else {
      int x = a[top--];

      System.out.println(x + " poped stack");
      return x;
    }
  }

  public int peek() {
    if (top < 0) {
      System.out.println("Stack Underflow");
      return 0;

    } else {
      int x = a[top];
      return x;
    }
  }

  public int[] getStack() {
    return a;
  }
}

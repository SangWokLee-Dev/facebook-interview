package com.facebook.data_structure.queue;

public class CustomQueue {
  private int queueSize;
  int top = 0;
  int bottom = 0;
  int[] queue;

  public CustomQueue(int queueSize) {
    setQueueSize(queueSize);
    queue = new int[queueSize];
  }

  public void push(int data) {
    if (top + 1 < queueSize) {
      queue[top] = data;
      top++;
    }
  }

  public void pop() {
    if (bottom + 1 < queueSize && bottom < top) {
      queue[bottom] = 0;
      bottom++;
    }
  }

  public void setQueueSize(int queueSize) {
    this.queueSize = queueSize;
  }
}

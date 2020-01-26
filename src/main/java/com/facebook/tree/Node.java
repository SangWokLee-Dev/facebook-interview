package com.facebook.tree;

public class Node {
  int value;
  Node left;
  Node right;

  Node(int value) {
    this.value = value;
    right = null;
    left = null;
  }

  public void setLeft() {
    this.left = left;
  }

  public void setRight() {
    this.right = right;
  }
}

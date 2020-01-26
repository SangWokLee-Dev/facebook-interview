package com.facebook.tree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/** TestBinaryTree tests Binary tree implementation */
public class TestBinaryTree {

  @Test
  @DisplayName("Testing binary tree implementation")
  public void testBinaryTree() {
    Node node = new Node(3);

    node.right = new Node(4);
    node.left = new Node(5);

    System.out.println(node.right.value);
    System.out.println(node.left.value);
  }
}

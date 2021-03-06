package com.facebook.leetcode.easy.bst;

import java.util.Stack;

/**
 * Given the root node of a binary search tree, return the sum of values of all nodes with a value
 * in the range [low, high]
 */
public class BST {
  int ans;

  public int rangeSumBST(TreeNode root, int L, int R) {
    ans = 0;
    dfs(root, L, R);
    return ans;
  }

  public void dfs(TreeNode node, int L, int R) {
    if (node != null) {
      if (L <= node.val && node.val <= R) ans += node.val;
      if (L < node.val) dfs(node.left, L, R);
      if (node.val < R) dfs(node.right, L, R);
    }
  }

  public int rangeSumBSTIteration(TreeNode root, int L, int R) {
    int ans = 0;
    Stack<TreeNode> stack = new Stack();
    stack.push(root);
    System.out.println(stack);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      if (node != null) {
        if (L <= node.val && node.val <= R) {
          ans += node.val;
        }
        if (L < node.val) {
          stack.push(node.left);
        }
        if (node.val < R) {
          stack.push(node.right);
        }
      }
    }
    return ans;
  }
}

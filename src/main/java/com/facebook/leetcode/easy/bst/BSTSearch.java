package com.facebook.leetcode.easy.bst;

import java.util.Stack;

public class BSTSearch {
  boolean result;

  public boolean search(TreeNode treeNode, int target) {
    result = false;
    dfs(treeNode, target);
    return result;
  }

  public void dfs(TreeNode treeNode, int target) {
    if (treeNode != null) {
      if (treeNode.val == target) {
        result = true;
      }
      dfs(treeNode.left, target);
      dfs(treeNode.right, target);
    }
  }

  public boolean searchIteration(TreeNode root, int target) {
    boolean ans = false;
    Stack<TreeNode> stack = new Stack();
    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      if (node != null) {
        System.out.println(node.val);
        if (node.val == target) {
          ans = true;
        }

        if (target < node.val) {
          stack.push(node.left);
        }
        if (node.val < target) {
          stack.push(node.right);
        }
      }
    }
    return ans;
  }
}

package com.facebook.leetcode.easy;

import com.facebook.leetcode.easy.bst.BST;
import com.facebook.leetcode.easy.bst.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BSTTest {

  @Test
  public void testBST() {
    TreeNode leftTreeNode = new TreeNode(5, new TreeNode(3), new TreeNode(7));
    TreeNode rightTreeNode = new TreeNode(15, null, new TreeNode(18));
    TreeNode treeNode = new TreeNode(10, leftTreeNode, rightTreeNode);

    BST bst = new BST();
    bst.dfs(treeNode, 7, 15);

    assertEquals(32, bst.rangeSumBST(treeNode, 7, 15));
  }
}

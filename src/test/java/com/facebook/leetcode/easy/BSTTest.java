package com.facebook.leetcode.easy;

import com.facebook.leetcode.easy.bst.BST;
import com.facebook.leetcode.easy.bst.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BSTTest {

  @Test
  public void testBSTExampleOne() {
    TreeNode treeNode =
        new TreeNode(
            10,
            new TreeNode(5, new TreeNode(3), new TreeNode(7)),
            new TreeNode(15, null, new TreeNode(18)));

    BST bst = new BST();
    bst.dfs(treeNode, 7, 15);

    assertEquals(32, bst.rangeSumBST(treeNode, 7, 15));
  }

  @Test
  public void testBSTExampleTwo() {
    TreeNode treeNode =
        new TreeNode(
            10,
            new TreeNode(
                5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
            new TreeNode(15, new TreeNode(13), new TreeNode(18)));
    BST bst = new BST();
    bst.dfs(treeNode, 6, 10);

    assertEquals(23, bst.rangeSumBST(treeNode, 6, 10));

  }
}

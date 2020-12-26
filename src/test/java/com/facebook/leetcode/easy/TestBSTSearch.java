package com.facebook.leetcode.easy;

import com.facebook.leetcode.easy.bst.BSTSearch;
import com.facebook.leetcode.easy.bst.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBSTSearch {

  @Test
  public void testBSTSearchExampleOne() {
    TreeNode treeNode =
        new TreeNode(
            10,
            new TreeNode(5, new TreeNode(3), new TreeNode(7)),
            new TreeNode(15, null, new TreeNode(18)));

    BSTSearch bst = new BSTSearch();
    assertEquals(true, bst.search(treeNode, 5));
    assertEquals(false, bst.search(treeNode, 1));
    assertEquals(true, bst.searchIteration(treeNode, 5));
    assertEquals(false, bst.searchIteration(treeNode, 1));
  }
}

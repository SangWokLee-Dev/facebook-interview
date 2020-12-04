package com.facebook.leetcode.easy;

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith
 * customer has in the jth bank. Return the wealth that the richest customer has. A customer's
 * wealth is the amount of money they have in all their bank accounts. The richest customer is the
 * customer that has the maximum wealth.
 *
 * <p>Input: accounts = [[1,2,3],[3,2,1]] Output: 6 Explanation: 1st customer Example 1: Input:
 * accounts = [[1,2,3],[3,2,1]] Output: 6 Explanation: 1st customer has wealth = 1 + 2 + 3 = 6 2nd
 * customer has wealth = 3 + 2 + 1 = 6 Both customers are considered the richest with a wealth 6
 * each, so return 6.
 *
 * <p>Example 2: Input: accounts = [[1,5], [7,3], [3,5]] Output: 10 Explanation: 1st customer has
 * wealth = 6 2nd customer has wealth = 10 3rd customer has wealth = 8 The 2nd customer is the
 * richest with a wealth of 10.
 *
 * <p>Example 3: Input accounts = [[2,8,7],[7,1,3],[1,9,5]] Output: 17
 */
public class RichestCustomerWealth {

  public int maximumWealth(int[][] accounts) {
    int[] sum = new int[accounts.length];

    for (int i = 0; i < accounts.length; i++) {
      sum[i] = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        sum[i] += accounts[i][j];
      }
    }
    int highestAccount = 0;
    for (int i = 0; i < sum.length; i++) {
      if (sum[i] > highestAccount) {
        highestAccount = sum[i];
      }
    }
    return highestAccount;
  }
}

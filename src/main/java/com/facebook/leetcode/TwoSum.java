package com.facebook.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  /**
   * findTwoSumBruteForce finds two sum with brute force
   *
   * @param arr - Array that is been searched
   * @param target - Target element
   * @return - Positions of indexes in the array
   */
  public static int[] findTwoSumBruteForce(int[] arr, int target) {
    int arrSize = arr.length;
    for (int index = 0; index < arrSize; index++) {
      int sum = 0;
      for (int nextIndex = 0; nextIndex < arrSize; nextIndex++) {
        sum += arr[index] + arr[nextIndex];
        if (sum == target) {
          return new int[] {index, nextIndex};
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  /**
   * findTwoSumLinearComplexity finds two sum with linear time complexity
   *
   * @param arr - Array that is been searched
   * @param target - Target element
   * @return Positions of indexes in the array
   */
  public static int[] findTwoSumLinearComplexity(int[] arr, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int index = 0; index < arr.length; index++) {
      map.put(arr[index], index);
    }

    for (int index = 0; index < arr.length; index++) {
      int complement = target - arr[index];
      if (map.containsKey(complement) && map.get(complement) != index) {
        return new int[] {index, map.get(complement)};
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}

package com.facebook.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArray {

  /**
   * O(n) remove duplicates function Can the time complexity improve? This method compromises time
   * space
   *
   * @param nums
   * @return
   */
  public static int removeDuplicates(int[] nums) {
    Set<Integer> numSets = new HashSet<>();
    int numSize = nums.length;
    for (int index = 0; index < numSize; index++) {
      numSets.add(nums[index]);
    }
    return numSets.size();
  }

  /**
   * @param nums
   * @return
   */
  public static int removeDuplicatesSolution(int[] nums) {
    int numSize = nums.length;

    // when the array size is 0 then return 0 as it does not require any calculation
    if (numSize == 0) {
      return 0;
    }
    int counter = 0;
    // Start from 1, improve time complexity
    for (int index = 1; index < numSize; index++) {
      if (nums[index] != nums[counter]) {
        counter++;
        nums[counter] = nums[index];
      }
    }
    return counter;
  }
}

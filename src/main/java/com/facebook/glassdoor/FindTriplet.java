package com.facebook.glassdoor;

import java.util.HashSet;
import java.util.Set;

/**
 * FindTriplet was first Second Round Facebook coding test It looks up three elements that sums up
 * to 0
 */
public class FindTriplet {

  /**
   * isTripletExists finds the triplet value that sums to 0
   * @param arr - Input element
   * @return result whether the triplet exists or not.
   */
  public static boolean isTripletExists(int[] arr) {
    int arrSize = arr.length;
    // Space Complexity of O(N)
    Set<Integer> integerSet = new HashSet<>();
    // Time Complexity of O(N)
    for (int index = 0; index < arrSize - 1; index++) {
      // Time Complexity of O(N^2)
      for (int nextIndex = index + 1; nextIndex < arrSize; nextIndex++) {
        int searchElement = (arr[index] + arr[nextIndex]) * -1;
        if (integerSet.contains(arr[nextIndex])) {
          return true;
        }
        integerSet.add(searchElement);
      }
    }
    return false;
  }
}

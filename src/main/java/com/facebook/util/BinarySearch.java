package com.facebook.util;

public class BinarySearch {
  private static Integer searchedData = null;

  /**
   * search searches sorted Array with binary search
   *
   * @param arr - Sorted Array
   * @param l - left side of the array position
   * @param r - right side of the array position
   * @param x - Data that is being searched
   * @return - Searched data
   */
  public static void search(int arr[], int l, int r, int x) {
    // If right hand side is greater than 1
    if (r >= 1) {
      // Mid position of the array is left + right - 1 divided by 2.
      int mid = (l + (r - 1)) / 2;
      // If the array element matches the searched value
      if (arr[mid] == x) {
        searchedData = x;
      }
      // If the searched array has the value less than searched data
      if (arr[mid] < x) {
        search(arr, mid + 1, r, x);
      }
      search(arr, l, mid - 1, x);
    }
  }

  public static Integer getSearchedData() {
    return searchedData;
  }
}

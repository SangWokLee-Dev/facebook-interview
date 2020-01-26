package com.facebook.glassdoor;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

/** FindTriplet find triplets that sums to 0 */
public class FindTriplet {

  /**
   * O(N^3)
   *
   * @param arr
   * @param n
   * @return
   */
  public static List<List<Integer>> findTriplets(int[] arr, int n) {
    long start = System.currentTimeMillis();
    List<List<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < n - 2; i++) {
      List<Integer> list = new ArrayList<>();
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          if (arr[i] + arr[j] + arr[k] == 0) {
            list.add(arr[i]);
            list.add(arr[j]);
            list.add(arr[k]);
          }
        }
      }
      if (list.size() > 0) {
        lists.add(list);
      }
    }
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("time elapsed with ON: " + timeElapsed);
    return lists;
  }

  /**
   * O(N^2)
   *
   * @param arr
   * @param n
   * @return
   */
  public static List<List<Integer>> findTripletsWithONSquared(int[] arr, int n) {
    long start = System.currentTimeMillis();
    List<List<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < n - 1; i++) {
      List<Integer> list = new ArrayList<>();
      Set<Integer> s = new HashSet<>();
      for (int j = i + 1; j < n; j++) {
        int x = -(arr[i] + arr[j]);
        if (s.contains(x)) {
          list.add(x);
          list.add(arr[i]);
          list.add(arr[j]);
        } else {
          s.add(arr[j]);
        }
      }

      if (list.size() > 0) {
        lists.add(list);
      }
    }
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("time elapsed with ON: " + timeElapsed);
    return lists;
  }
}

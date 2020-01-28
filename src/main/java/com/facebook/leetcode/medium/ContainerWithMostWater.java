package com.facebook.leetcode.medium;

public class ContainerWithMostWater {

  public static int maxArea(int[] height) {
    int maxArea = 0;
    for (int index = 0; index < height.length; index++) {
      for (int nextIndex = index + 1; nextIndex < height.length; nextIndex++) {
        maxArea =
            Math.max(maxArea, Math.min(height[index], height[nextIndex]) * (nextIndex - index));
      }
    }
    return maxArea;
  }

  public static int maxAreaOptimised(int[] height) {
    int maxArea = 0, l = 0, r = height.length - 1;
    while (l < r) {
      maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - 1));
      if (height[l] < height[r]) {
        l++;
      } else {
        r--;
      }
    }
    return maxArea;
  }
}

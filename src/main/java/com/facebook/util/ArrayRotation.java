package com.facebook.util;

/** ArrayRotation rotates array. */
public class ArrayRotation {

  public static int[] leftRotate(int[] arr) {
    int arrSize = arr.length;
    int firstIndexVal = arr[0];

    for (int index = 0; index < arrSize - 1; index++) {
      int nextVal = arr[index + 1];
      arr[index] = nextVal;
    }
    arr[arrSize - 1] = firstIndexVal;
    return arr;
  }

  public static int[] shiftLeftWithIndex(int[] arr, int count) {
    int sizeArray = arr.length;
    int[] rightArr = tempRightIndexArr(arr, count);

    for (int index = 0; index < sizeArray - count; index++) {
      int nextVal = arr[index + count];
      arr[index] = nextVal;
    }

    for (int index = 0; index < count; index++) {
      arr[arr.length - (index + 1)] = rightArr[count - (index + 1)];
    }
    return arr;
  }

  private static int[] tempRightIndexArr(int[] arr, int count) {
    int[] rightArr = new int[count];

    for (int index = 0; index < count; index++) {
      rightArr[index] = arr[index];
    }
    return rightArr;
  }
}

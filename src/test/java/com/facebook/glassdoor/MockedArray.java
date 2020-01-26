package com.facebook.glassdoor;

public class MockedArray {

  public static int[] generateMock(int size) {

    int[] mockedData = new int[size];

    for (int index = 0; index < size; index++) {
      mockedData[index] = getRandomNumberInRange(-100, 100);
    }

    return mockedData;
  }

  private static int getRandomNumberInRange(int min, int max) {

    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }

    return (int) (Math.random() * ((max - min) + 1)) + min;
  }
}

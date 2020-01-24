package com.facebook.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayRotationTest {
  @Test
  @DisplayName("Rotate array to the left by one")
  public void testArrayRotation() {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int expectedArr[] = {2, 3, 4, 5, 6, 1};
    int actual[] = ArrayRotation.leftRotate(arr);
    assertEquals(expectedArr[0], actual[0]);
    assertEquals(expectedArr[1], actual[1]);
    assertEquals(expectedArr[2], actual[2]);
    assertEquals(expectedArr[3], actual[3]);
    assertEquals(expectedArr[4], actual[4]);
    assertEquals(expectedArr[5], actual[5]);
  }

  @Test
  @DisplayName("Rotate array to the left by parameterized number")
  public void testArrayRotationWithIndex() {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int expectedArr[] = {2, 3, 4, 5, 6, 1};
    int actualArr[] = ArrayRotation.shiftLeftWithIndex(arr, 1);

    assertEquals(expectedArr[0], actualArr[0]);
    assertEquals(expectedArr[1], actualArr[1]);
    assertEquals(expectedArr[2], actualArr[2]);
    assertEquals(expectedArr[3], actualArr[3]);
    assertEquals(expectedArr[4], actualArr[4]);
    assertEquals(expectedArr[5], actualArr[5]);
  }

  @Test
  @DisplayName("Rotate array to the left by parameterized number")
  public void testArrayRotationWithTwoIndexes() {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int expectedArr[] = {3, 4, 5, 6, 1, 2};
    int actualArr[] = ArrayRotation.shiftLeftWithIndex(arr, 2);

    assertEquals(expectedArr[0], actualArr[0]);
    assertEquals(expectedArr[1], actualArr[1]);
    assertEquals(expectedArr[2], actualArr[2]);
    assertEquals(expectedArr[3], actualArr[3]);
    assertEquals(expectedArr[4], actualArr[4]);
    assertEquals(expectedArr[5], actualArr[5]);
  }

  @Test
  @DisplayName("Rotate array to the left by parameterized number")
  public void testArrayRotationWithThreeIndexes() {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int expectedArr[] = {4, 5, 6, 1, 2, 3};
    int actualArr[] = ArrayRotation.shiftLeftWithIndex(arr, 3);

    assertEquals(expectedArr[0], actualArr[0]);
    assertEquals(expectedArr[1], actualArr[1]);
    assertEquals(expectedArr[2], actualArr[2]);
    assertEquals(expectedArr[3], actualArr[3]);
    assertEquals(expectedArr[4], actualArr[4]);
    assertEquals(expectedArr[5], actualArr[5]);
  }

  @Test
  @DisplayName("Rotate array to the left by parameterized number")
  public void testArrayRotationWithFourIndexes() {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int expectedArr[] = {5, 6, 1, 2, 3, 4};
    int actualArr[] = ArrayRotation.shiftLeftWithIndex(arr, 4);

    assertEquals(expectedArr[0], actualArr[0]);
    assertEquals(expectedArr[1], actualArr[1]);
    assertEquals(expectedArr[2], actualArr[2]);
    assertEquals(expectedArr[3], actualArr[3]);
    assertEquals(expectedArr[4], actualArr[4]);
    assertEquals(expectedArr[5], actualArr[5]);
  }

  @Test
  @DisplayName("Rotate array to the left by parameterized number")
  public void testArrayRotationWithFiveIndexes() {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int expectedArr[] = {6, 1, 2, 3, 4, 5};
    int actualArr[] = ArrayRotation.shiftLeftWithIndex(arr, 5);

    assertEquals(expectedArr[0], actualArr[0]);
    assertEquals(expectedArr[1], actualArr[1]);
    assertEquals(expectedArr[2], actualArr[2]);
    assertEquals(expectedArr[3], actualArr[3]);
    assertEquals(expectedArr[4], actualArr[4]);
    assertEquals(expectedArr[5], actualArr[5]);
  }
}

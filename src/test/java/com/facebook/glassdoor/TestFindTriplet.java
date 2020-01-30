package com.facebook.glassdoor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFindTriplet {

  @Test
  @DisplayName("successfully finds triplets")
  public void testFindTriplet() {
    int[] input = {1, 2, -3, 4, 5};
    boolean isTripletExists = FindTriplet.isTripletExists(input);

    assertEquals(true, isTripletExists);
  }
}

package com.facebook.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichestCustomerWealthTest {

  @Test
  public void testRichestCustomerWealthExampleOne() {
    int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
    RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
    assertEquals(6, richestCustomerWealth.maximumWealth(accounts));
  }

  @Test
  public void testRichestCustomerWealthExampleTwo() {
    int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
    RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
    assertEquals(10, richestCustomerWealth.maximumWealth(accounts));
  }

  @Test
  public void testRichestCustomerWealthExampleThree() {

    int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
    RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
    assertEquals(17, richestCustomerWealth.maximumWealth(accounts));
  }
}

package com.facebook.lists;

public class LinkedList {
  public static void main(String[] args) {
    Node node = new Node(3);
    node.next = new Node(4);

    System.out.println(node.data);
    System.out.println(node.next.data);
  }
}

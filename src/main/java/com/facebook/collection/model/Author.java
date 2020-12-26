package com.facebook.collection.model;

public class Author implements Comparable<Author> {
  public String firstName;
  public String lastName;
  public String bookName;

  public Author(String first, String last, String book) {
    this.firstName = first;
    this.lastName = last;
    this.bookName = book;
  }

  @Override
  public int compareTo(Author au) {

    int last = this.lastName.compareTo(au.lastName);
    // Sorting by first name if last name is same d
    return last == 0 ? this.firstName.compareTo(au.firstName) : last;
  }
}

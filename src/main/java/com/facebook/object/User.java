package com.facebook.object;

public class User {
  private String name;
  private int age;
  private String passport;

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof User)) {
      return false;
    }
    User user = (User) o;
    return user.name.equals(name) && user.age == age && user.passport.equals(passport);
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + name.hashCode();
    result = 31 * result + age;
    result = 31 * result + passport.hashCode();
    return result;
  }

  public static void testPrint(String... val) {
    System.out.println(val[0]);
  }

  public static void main(String[] args) {
    testPrint("a", "b", "c", "d");
  }
}

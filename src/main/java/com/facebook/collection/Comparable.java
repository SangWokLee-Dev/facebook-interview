package com.facebook.collection;

import com.facebook.collection.model.Employee;

import java.time.LocalDate;
import java.util.*;

/**
 * Comparable interface is mainly used to sort the arrays (or lists) of custom objects. Lists (and
 * arrays) of objects that implement Comparable interface can be sorted automatically by
 * Collections.sort (and Arrays.sort). Before we see how to sort an objects of custom objects, let
 * see how we can sort elements of arrays and Wrapper classes that already implements Comparable.
 *
 */
public class Comparable {
  public static void main(String[] args) {
    //
    //    int[] arr = {11, 55, 22, 0, 89};
    //
    //    Arrays.sort(arr);
    //    System.out.println("Sorted Int Array: ");
    //    System.out.println(Arrays.toString(arr));
    //
    //    System.out.println("Sorted String Array: ");
    //    String[] names = {"Steve", "Ajeet", "Kyle"};
    //    Arrays.sort(names);
    //    System.out.println(Arrays.toString(names));
    //
    //    System.out.println("Sorted List: ");
    //    List fruits = new ArrayList();
    //
    //    fruits.add("Orange");
    //    fruits.add("Banana");
    //    fruits.add("Apple");
    //    fruits.add("Guava");
    //    fruits.add("Grapes");
    //
    //    Collections.sort(fruits);
    //    for (Object s : fruits) System.out.print(s + ", ");

    ArrayList<Employee> list = new ArrayList<>();

    list.add(new Employee(22l, "Lokesh", LocalDate.now()));
    list.add(new Employee(18l, "Alex", LocalDate.now()));
    list.add(new Employee(30l, "Bob", LocalDate.now()));
    list.add(new Employee(600l, "Charles", LocalDate.now()));
    list.add(new Employee(5l, "David", LocalDate.now()));

    Comparator<Employee> groupByComparator =
        Comparator.comparing(Employee::getName).thenComparing(Employee::getId);

    Collections.sort(list, groupByComparator);

    for (Employee employee : list) {
      System.out.println(employee.toString());
    }

    //// Natural order
    //    Collections.sort(list);
    //
    //    System.out.println(list);
    //
    //// Sort in reverse natural order
    //    Collections.sort(list, Collections.reverseOrder());
    //
    //    System.out.println(list);
  }
}

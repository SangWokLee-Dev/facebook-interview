package com.facebook.collection;

import com.facebook.collection.model.Employee;

import java.util.Comparator;

public class NameSorter implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareToIgnoreCase(e2.getName());
    }
}

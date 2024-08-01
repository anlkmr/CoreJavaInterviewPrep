package com.java.CoreJavaInterviewPrep.java8.stream_intermediate_operations;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Charlie"),
                new Employee("David")
        );

        // Sorting employees by name
        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());

        // Printing the sorted employees
        sortedEmployees.forEach(employee -> System.out.println(employee.getName()));
    }
}


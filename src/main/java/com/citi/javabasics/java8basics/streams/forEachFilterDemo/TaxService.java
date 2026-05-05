package com.citi.javabasics.java8basics.streams.forEachFilterDemo;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input) {
        return (input.equalsIgnoreCase("tax")) ? (DatabaseEmployee.getAllEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList()))
                : (DatabaseEmployee.getAllEmployees().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        System.out.println(TaxService.evaluateTaxUsers("tax"));
        System.out.println(TaxService.evaluateTaxUsers("non-tax"));
    }

}

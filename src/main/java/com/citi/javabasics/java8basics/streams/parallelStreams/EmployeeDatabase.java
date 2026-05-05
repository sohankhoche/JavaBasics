package com.citi.javabasics.java8basics.streams.parallelStreams;

import com.citi.javabasics.java8basics.streams.mapReduceExample.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {

    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        for(int i=0; i<=1000; i++){
            employees.add(new Employee(i, "Employee" + i, "A", (double) new Random().nextInt(100 * 100)));
        }
        return employees;
    }

}

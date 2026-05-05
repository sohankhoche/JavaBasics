package com.citi.javabasics.java8basics.streams.SortListDemo;

import com.citi.javabasics.java8basics.streams.forEachFilterDemo.DatabaseEmployee;
import com.citi.javabasics.java8basics.streams.forEachFilterDemo.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {
        System.out.println("Stream Sort List Demo!");
        /*
        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(9);
        intList.add(7);
        intList.add(8);
        intList.add(3);
        intList.add(1);
        intList.add(4);
        intList.add(6);
        intList.add(5);
        System.out.println(intList);
        System.out.println("Sorting list in Ascending Order");
        Collections.sort(intList);
        System.out.println("===============================");
        System.out.println("Sorting list in Descending Order");
        Collections.reverse(intList);
        System.out.println("===============================");
        System.out.println(intList);
        System.out.println("===============================");
        System.out.println("Sorting list with Streams sort method --> Ascending Order");
        intList.stream().sorted().forEach(System.out::println);
        System.out.println("===============================");
        System.out.println("Sorting list with Streams sort method --> Descending Order Comparator.reverseOrder() Function");
        intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("===============================");
        System.out.println("Sorting list with Streams sort method --> Collections.reverOrder() Function");
        intList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
         */

        List<Employee> employees = DatabaseEmployee.getAllEmployees();
        Collections.sort(employees, new MyComparator()); // use anonymous class here instead of writing separate class below
        System.out.println("Ascending Order sorted Employees using comparator class: " + employees);

        // use anonymous class
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        });
        System.out.println("Ascending Order sorted Employees using Anonymous class: " + employees);

        // using lambda expression to write this logic
        //(o1,o2) -> ((int) (o1.getSalary()-o2.getSalary()));
        Collections.sort(employees, (o1,o2) -> ((int) (o1.getSalary()-o2.getSalary())));
        System.out.println("Ascending Order sorted Employees using Lambda Expression : " + employees);

        // Directly using Lambda Expression and with Streams
        System.out.println("Ascending Order sorted Employees using Streams and Lambda Expression : " + employees);
        System.out.println("=====================================================");
        employees.stream().sorted((o1, o2) -> ((int) (o1.getSalary() - o2.getSalary()))).forEach(System.out::println);

        //Sorting using Comparator.comparing method
        System.out.println("=====================================================");
        System.out.println("Sorting using Comparator.comparing method");
        employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
        System.out.println("=====================================================");
        System.out.println("Sorting using Comparator.comparing method and Method Reference instead of Lambda Expression");
        employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
    }
}

class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()-o2.getSalary());
    }
}

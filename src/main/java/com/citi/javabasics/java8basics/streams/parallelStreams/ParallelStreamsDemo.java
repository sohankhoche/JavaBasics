package com.citi.javabasics.java8basics.streams.parallelStreams;

import com.citi.javabasics.java8basics.streams.mapReduceExample.Employee;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamsDemo {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;
        System.out.println("Parallel Streams Demo");
        start = System.currentTimeMillis();
        //IntStream.rangeClosed(1,100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Normal Sequential Stream took execution time: " + (end - start));
        System.out.println("===============================================================");
        start = System.currentTimeMillis();
        //IntStream.rangeClosed(1,100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream took execution time: " + (end - start));

        IntStream.rangeClosed(1,50).forEach(x -> System.out.println("Thread Name is: " + Thread.currentThread().getName() + " : " + x));
        System.out.println("=========================  Parallel Streams  =================================");
        IntStream.rangeClosed(1,50).parallel().forEach(x -> System.out.println("Thread Name is: " + Thread.currentThread().getName() + " : " + x));

        // Get Employees
        List<Employee> employees = EmployeeDatabase.getEmployees();

        // Normal Streams
        start = System.currentTimeMillis();
        double salaryAvgWithNormalStreams = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Normal Sequential Stream took execution time: " + (end - start) + "  Avg Salary :" + salaryAvgWithNormalStreams);
        System.out.println("=========================  Parallel Streams  =================================");
        start = System.currentTimeMillis();
        double salaryAvgWithParallelStreams = employees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream took execution time: " + (end - start) + "  Avg Salary : " + salaryAvgWithParallelStreams);

    }

}

package com.citi.javabasics.java8basics.streams.mapReduceExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class MapReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        int sum = 0;
        for (int no : numbers) {
            sum = sum + no;
        }
        System.out.println(sum);

        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceWithMethodReference.get());

        Integer multiplicationResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiplicationResult);

        Integer maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValue);

        Integer maxValue1 = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValue1);

        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? (word1.concat(String.valueOf(word1.length()))) : (word2.concat(String.valueOf(word2.length()))))
                .get();
        System.out.println(longestString);

        // get Employees with Grade A --> using filter method
        // get Employees' Salary with Grade A
        // map value to double using mapToDouble()
        // call reduction function --> average() to Calculate average salary
        double averageSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average().getAsDouble();
        System.out.println("averageSalary: " + averageSalary);

        double sumSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println("sumSalary : "  + sumSalary);

        double maxSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .max().getAsDouble();
        System.out.println("maxSalary : "  + maxSalary);

        double minSalary = EmployeeDatabase.getEmployees().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(e -> e.getSalary())
                .mapToDouble(i->i)
                .min().getAsDouble();
        System.out.println("minSalary : "  + minSalary);

    }

}

package com.citi.javabasics.java8basics.streams.SortMapDemo;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {
        System.out.println("Sort Map with Stream Demo");
        Map<String, Integer> map = new HashMap<>();
        map.put("Eight", 8);
        map.put("Five", 5);
        map.put("Three", 3);
        map.put("Seven", 7);
        map.put("Four", 4);
        map.put("Six", 6);

        // Anonymous Innter Class Approach
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println("Sorted with Anonymous Inner Class Approach :" + entries);
        for(Map.Entry<String, Integer> entry: entries){
            System.out.println("Key: " + entry.getKey() + "::" + "Value: " + entry.getValue());
        }

        // Using Lambda Expression Apprach
        // (o1, o2) -> {o1.getKey().compareTo(o2.getKey());}
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        System.out.println("Sorted with Lambda Exp Approach :" + entries);
        for(Map.Entry<String, Integer> entry: entries){
            System.out.println("Key: " + entry.getKey() + "::" + "Value: " + entry.getValue());
        }

        // Using Streams to sort --> Modern way
        System.out.println("Sorted with Streams sorted Method and comparingByKey() :");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("========================================================");

        System.out.println("Sorted with Streams sorted Method and comparingByValue() :");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("========================================================");

        System.out.println("******************************************************************************************");
        System.out.println("******************  Sorting Map with Custom Objects  ************************");
        System.out.println("******************************************************************************************");

        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);

        System.out.println(employeeMap);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
        System.out.println("========================================================");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed())).forEach(System.out::println);
    }

}

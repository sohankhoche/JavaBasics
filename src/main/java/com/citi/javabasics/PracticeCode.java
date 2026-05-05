package com.citi.javabasics;

import com.citi.javabasics.Sortable.Employee;
import com.citi.javabasics.inheritance.ChildClass;
import com.citi.javabasics.inheritance.ParentClass;

import java.util.*;

public class PracticeCode {

    public static void main(String[] args) {

        Map map = new HashMap<String, Integer>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);

        Set<String> months = map.keySet();
        System.out.println("months: " + months.toString());
        Collection<Integer> numbers = map.values();
        System.out.println("number: " + numbers.toString());

        int count = Math.toIntExact(numbers.stream().filter(i -> i == 10).count());
        System.out.println("count var = " + count);
        String s1 = "Str1";
        String s2 = "Str1";
        System.out.println("s1 == s2 : " +s1 == s2);
        System.out.println("equals method : " + s1.equals(s2));

        Employee emp1 = new Employee(100, "Adam1");
        Employee emp2 = new Employee(21, "John10");
        Employee emp3 = new Employee(3, "MikeTBH45");
        Employee emp4 = new Employee(45, "Ann");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        Employee [] empArr = new Employee[4];
        empArr[0] = emp1;empArr[1] = emp2; empArr[2] = emp3; empArr[3] = emp4;
        Arrays.sort(empArr);
        Collections.sort(employeeList);
        System.out.println("Natural Soring based on Id using Comparable and CompareTo() Method: " + Arrays.toString(empArr));
        System.out.println("Sorted using Collections.sort() Natural Sorting : " + employeeList);

        Arrays.sort(empArr, Employee.nameComparator);
        employeeList.sort(Employee.nameComparator);
        System.out.println("Custom Sorting based on custom name Field and Compare() Method: " + Arrays.toString(empArr));
        System.out.println("Sorted using Collections.sort() Custom Sorting Name Variable: " + employeeList);

        employeeList.sort(Employee.StrLengthComparator);
        System.out.println("final StrLength Comparator: output is::" + employeeList);

        // Code for Inheritance Parent Child Relationship

        ParentClass parent = new ParentClass(1, "parentString");
        ChildClass childClass = new ChildClass(1, 1,"childString", "parent");
        System.out.println("output of childChlass parnet mthd call: parent.toStr()-->" + parent.toString());
        childClass.parentMethod();
        System.out.println("output of parnet mthd call: " + childClass.getParent() + parent.getParent());
        parent.parentMethod();
    }






}

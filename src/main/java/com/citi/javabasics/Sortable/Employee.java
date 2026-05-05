package com.citi.javabasics.Sortable;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

    int id;
    String name;

    public Employee(int id) {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.getId();
    }

    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    public static Comparator<Employee> StrLengthComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            if(e1.getName().length() > e2.getName().length())
                return 1;
            else if (e1.getName().length() < e2.getName().length())
                return -1;
            else
                return 0;
        }
    };
}

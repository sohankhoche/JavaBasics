package com.citi.javabasics.java8basics.streams.mapAndflatMapDemo;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapDemo {

    public static void main(String[] args) {
        System.out.println("map() Vs flatMap() Method Demo!");

        List<Customer> customers = EkartDataBase.getAll();

        // get Email Ids for all the customers from this customers list
        // Data Transformation --> List<Customers> to List<String>  ----> Use map()
        System.out.println("Printing Customers Email Ids using stream API map() Method!");
        // customer -> customer.getEmail() --> one to one mapping
        List<String> emails = customers.stream().map(Customer::getEmail).collect(Collectors.toList());
        System.out.println(emails);

        // get Phone Numbers for all the customers from this customers List
        // Data Transformation --> List<Customers> to List<List<String>>  ----> Using map() instead go for flatMap() to get List<String>
        List<List<String>> phoneNumbers = customers.stream().map(Customer::getPhoneNumbers).collect(Collectors.toList());
        System.out.println(phoneNumbers); // flatter the data
        // customer -> customer.getPhoneNumbers() --> one to many mapping
        List<String> numbers = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("numbers: after flattering the data :" + numbers);
    }

}

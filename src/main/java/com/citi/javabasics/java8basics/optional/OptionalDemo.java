package com.citi.javabasics.java8basics.optional;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String email) throws Exception {
        List<Customer> customers = EkartDataBase.getAll();
        /*
        return customers.stream()
                .filter(customer -> customer.getEmail().filter(email::equals).isPresent())
                .findAny().orElseThrow(()->new Exception("no customer present with this email id"));
       */

       return customers.stream().filter(customer -> customer.getEmail().filter(email::equals).isPresent())
               .findAny().orElseThrow(()->new Exception("No CustomerExosotson Wordl Cass env"));


    }

    public static void main(String[] args) throws Exception {
        System.out.println("Optional Demo!");

        Customer customer=new Customer(101, "john", "test@gmail.com", Arrays.asList("397937955", "21654725"));
        //empty
        //of
        //ofNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // Go For Optional.of() Method when you know the object being passed is not null -- otherwise it will throw NPE
        //Optional<String> emailOptional = Optional.of(customer.getEmail());
        //System.out.println(emailOptional); // NullPointerException when email is null

        Optional<String> emailOptional2 = Optional.ofNullable(String.valueOf(customer.getEmail()));
        //System.out.println((emailOptional2.isPresent())?("If"+emailOptional2.get()):false);
        //System.out.println(emailOptional2.orElse("Email is Empty!"));
        //System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("email not present")));

        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()-> "Default Email Fetched!"));
            getCustomerByEmailId("pqr");
    }
}

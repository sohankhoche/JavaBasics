package com.citi.javabasics.java8basics.funcinterfaces;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        System.out.println("supplier demo!");
        // It will just supply the object and does not take any input value
        // public R get()
        // No chaining as only output is given

        // supplier does not contain any other static or default method

        Supplier<Date> currentDate = () -> new Date();
        System.out.println("currentDate is:" + currentDate.get().getTime());
    }

}

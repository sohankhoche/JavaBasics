package com.citi.javabasics.java8basics.funcinterfaces;

import java.util.function.Function;

public class FunctionDemo {

    // Only abstract method present in Function is
    // R apply(T t)
    // Given some input, perform some operation and return the result (not necessarily a boolean value)
    // declare both input type and return type
    // declare in java.util.function package

    // Functional Chaining


    public static void main(String[] args) {
        System.out.println(
                "Inside Function Functional Interface"
        );

        Function<Integer, Integer> squareMe = i -> (i*i);
        System.out.println("The square is: " + squareMe.apply(25));

    }

}

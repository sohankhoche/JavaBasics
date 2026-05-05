package com.citi.javabasics.java8basics.funcinterfaces;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        System.out.println("Welcome to Consumer Functional Interface Demo!");

        // It Takes one input and does not return any output
        // it is consuming the item and never supply anything in return.
        // e.g. take any object and save details to db - do not return anything in return.

        // accept method
        // public void accept(T t)

        Consumer<Integer> squareFunction = i -> System.out.println("Taking input and then performing the Square of the given integer Operation and does not return anything : " + (i * i));
        squareFunction.accept(7);


    }

}

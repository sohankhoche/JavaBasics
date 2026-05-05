package com.citi.javabasics.java8basics.lambdaexpressions;

import java.util.function.BiConsumer;

public class LambdaDemo {

    public static void main(String[] args) {
        System.out.println("calling add method");
        LambdaDemo ld = new LambdaDemo();
        ld.add(10,5);
        System.out.println("Welcome to Lambda Expressions Demo!");
        BiConsumer<Integer, Integer> consumer = (a, b) -> System.out.println("The sum from lambda expression: " + (a + b));
        consumer.accept(10,5);
    }

    public void add(int a, int b){
        System.out.println("The sum is :" + (a + b));
    }

}

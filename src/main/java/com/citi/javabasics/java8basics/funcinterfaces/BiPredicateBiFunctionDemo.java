package com.citi.javabasics.java8basics.funcinterfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {

    public static void main(String[] args) {
        System.out.println("Bi Inteface demo!");
        BiPredicate<Integer, Integer> checkSumOfTwo = (a, b) -> (a + b) >= 5;
        System.out.println("Sum of 2 + 5 is greater than 5 : " + checkSumOfTwo.test(2,5));
        System.out.println("Sum of 2 + 1 is greater than 5 : " + checkSumOfTwo.test(2,1));
        BiFunction<Integer, Integer, Integer> multiPlyBoth = (a, b) -> (a * b);
        System.out.println("multiplication of 5 and 10 is : " + multiPlyBoth.apply(5, 10));

    }

}

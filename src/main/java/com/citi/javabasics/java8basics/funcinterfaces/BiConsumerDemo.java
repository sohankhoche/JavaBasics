package com.citi.javabasics.java8basics.funcinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        System.out.println("BiConsumer Demo!");
        BiConsumer<Integer, Integer> biconsumer = (i, j) -> System.out.println("The multiplication is: " + (i * j));
        biconsumer.accept(5,12);
    }
}

package com.citi.javabasics.java8basics.funcinterfaces;

import java.util.function.Consumer;

public class ConsumerChainingDemo {

    public static void main(String[] args) {

        System.out.println("consumer chaining demo!");

        Consumer<Integer> squareMe = i -> System.out.println("The square is: " + (i * i));
        Consumer<Integer> doubleMe = i -> System.out.println("The double is: " + (i * 2));
        Consumer<Integer> tripleMe = i -> System.out.println("The tripple is: " + (i * 3));

        System.out.println("the operation is : " + "squareMe.andThen(doubleMe).andThen(tripleMe).accept(6)");
        squareMe.andThen(doubleMe).andThen(tripleMe).accept(6);

    }

}

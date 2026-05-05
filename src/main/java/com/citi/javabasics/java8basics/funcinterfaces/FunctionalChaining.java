package com.citi.javabasics.java8basics.funcinterfaces;

import java.util.function.Function;

public class FunctionalChaining {

    public static void main(String[] args) {
        System.out.println("Inside Functional Chaining Demo!");

        Function<Integer, Integer> doubleit = i -> (i * 2);
        System.out.println("double Function->" + doubleit.apply(2));
        Function<Integer, Integer> cubeit = i -> (i * i * i);
        System.out.println("cube function->" + cubeit.apply(2));

        System.out.println("First double and then cube -> " + doubleit.andThen(cubeit).apply(2));
        System.out.println("First cube it and then double -> " + doubleit.compose(cubeit).apply(2));
        System.out.println("First double and then cube -> but the params changed: " + cubeit.andThen(doubleit).apply(2));

        // combining andThen andThen and compose multiple times
        System.out.println("first doubleit and then cubeit and then double it and then again cubeit "
        + doubleit.andThen(cubeit).andThen(doubleit).andThen(cubeit).apply(2));

        System.out.println("first cubeit and then doubleit and then compose "
                + doubleit.andThen(cubeit).compose(cubeit).apply(2));

    }

}

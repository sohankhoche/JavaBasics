package com.citi.javabasics.java8basics.streams.skipLimitDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitExample {

    public static void main(String[] args) {
        System.out.println("skip() and limit() Functions Demo!");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> collected = numbers.stream().skip(1).limit(7).collect(Collectors.toList());
        System.out.println(collected);

    }

}

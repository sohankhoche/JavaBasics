package com.citi.javabasics.java8basics.streams.forEachFilterDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sohan");
        list.add("Saurabh");
        list.add("Kane");
        list.add("Peter");
        list.add("Brock");
        list.add("Goldberg");
        // Using forEach method of stream to iterate over the list
        list.stream().forEach(System.out::println);

        // Using filter method of stream to filter out the data from the list
        System.out.println("Filter Method in the Works!");
        list.stream().filter(t->t.startsWith("S")).forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.forEach((k, v) -> System.out.println("Key: " + k + " : " + " Value: " + v));
        map.entrySet().stream().forEach(entryObj -> System.out.println(entryObj));
        System.out.println("Filter Method in the works for the Map Object!");
        System.out.println("=====================================================");
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(System.out::println);

        //Consumer<String> consumer = t-> System.out.println(t);
        Consumer<String> consumer = System.out::println;
        consumer.accept("javaTechie");
        for(String s1 : list){
            consumer.accept(s1);
        }
    }

}

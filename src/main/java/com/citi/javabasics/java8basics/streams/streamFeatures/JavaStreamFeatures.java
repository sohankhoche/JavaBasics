package com.citi.javabasics.java8basics.streams.streamFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamFeatures {

    public static void main(String[] args) {

        System.out.println("Java 8 Streams Hidden Features and Methods");
        /*
            1. Stream.ofNullable
            2. Stream.iterate
            3. Collectors.collectingAndThen
            4. Stream.takeWhile and Stream.dropWhile
            5. Collectors.teeing
            6. Stream.concat
            7. Collectors.partitionBy
            8. IntStream for Ranges
        */

        List<String> names = Arrays.asList("Basant", "Santosh", null, "Vinod", null, "Sam", "John", null, "Vikas");
        List<String> nonNullNames = names.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println("non-null Names: " + nonNullNames);
        List<String> usingofNullableMethod = names.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
        System.out.println(usingofNullableMethod) ;

    }

}

package com.janjanee;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");

        stream.forEach(System.out::println);

        stream = Stream.of(new String[]{"d", "e", "f"});

        stream.forEach(System.out::println);

        stream = Arrays.stream(new String[]{"g", "h", "i"});

        stream.forEach(System.out::println);

        IntStream intStream = IntStream.of(1, 5, 10, 8);
        intStream.forEach(System.out::println);

        intStream = new Random().ints(0, 11);
        intStream.limit(5).forEach(System.out::println);

        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
        evenStream.limit(5).forEach(System.out::println);

        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(2).forEach(System.out::println);


        Stream empty = Stream.empty();
        long count = empty.count();
        System.out.println(count);

        String[] str1 = {"123", "456", "789"};
        String[] str2 = {"abc", "def", "ghi"};

        Stream<String> strStream1 = Stream.of(str1);
        Stream<String> strStream2 = Stream.of(str2);
        Stream<String> concatStream = Stream.concat(strStream1, strStream2);

        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        intStream1.skip(3).limit(5).forEach(System.out::println);
    }
}

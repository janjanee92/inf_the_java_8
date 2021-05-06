package com.janjanee;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceTest {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java",  "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strArr)
                .filter(s -> s.charAt(0) == 's').findFirst();

        System.out.println("noEmptyStr=" + noEmptyStr);
        System.out.println("sWord=" + sWord.orElseThrow());

        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int reduce = intStream1.reduce(0, (a, b) -> a + 1);
        OptionalInt reduce1 = intStream1.reduce((a, b) -> a + b);

        OptionalInt reduce2 = intStream1.reduce(Integer::max);
        OptionalInt reduce3 = intStream1.reduce(Integer::min);
        System.out.println(reduce2.getAsInt());
        System.out.println(reduce3);


    }
}

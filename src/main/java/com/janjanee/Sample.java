package com.janjanee;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<Coffee> starbucksCoffee = new ArrayList<>();
        starbucksCoffee.add(new Coffee(1, "caffe americano", false));
        starbucksCoffee.add(new Coffee(2, "caffe latte", false));
        starbucksCoffee.add(new Coffee(3, "cold brew", false));
        starbucksCoffee.add(new Coffee(4, "dolce cold brew", true));
        starbucksCoffee.add(new Coffee(5, "vanilla cream cold brew", true));

        Stream<Integer> integerStream = starbucksCoffee.stream().map(Coffee::getId);
        IntStream intStream = starbucksCoffee.stream().mapToInt(Coffee::getId);

        IntSummaryStatistics stat = intStream.summaryStatistics();
        System.out.println(stat.getMax());
        System.out.println(stat.getAverage());
        System.out.println(stat.getSum());

        Stream<Integer> boxed = intStream.boxed();
        Stream<String> stringStream = intStream.mapToObj(s -> s + "");

        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"apple", "banana", "mango"},
                new String[]{"cat", "dog", "horse"}
        );

        Stream<Stream<String>> strStrStrm = strArrStrm.map(Arrays::stream);
        Stream<String> strStream = strArrStrm.flatMap(Arrays::stream);

        boolean result = starbucksCoffee.stream()
                .anyMatch(c -> c.getName().contains("cold"));

        long count = starbucksCoffee.stream()
                .filter(c -> c.getName().startsWith("caffee"))
                .count();


    }
}

package com.janjanee;

import java.util.*;
import java.util.stream.Collectors;
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

        IntStream lottoStream = new Random().ints(1, 46).distinct().limit(6);
        Optional<Integer> collect = lottoStream.boxed()
                .collect(Collectors.reducing(Integer::max));
        System.out.println(collect.get());

        int sum = starbucksCoffee.stream()
                .collect(Collectors.reducing(0, Coffee::getId, Integer::sum));
        System.out.println(sum);


    }
}

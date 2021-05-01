package com.janjanee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("janjanee");
        names.add("jihan");
        names.add("bare");
        names.add("foo");

        List<String> collect = names.stream()
                .map(s -> {
                    System.out.println(s);
                    return s.toUpperCase();
                }).collect(Collectors.toList());

        collect.forEach(System.out::println);

        System.out.println("==============");

        names.forEach(System.out::println);
    }
}

package com.janjanee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        List<Coffee> starbucksCoffee = new ArrayList<>();
        starbucksCoffee.add(new Coffee(1, "caffe americano", false));
        starbucksCoffee.add(new Coffee(2, "caffe latte", false));
        starbucksCoffee.add(new Coffee(3, "cold brew", false));
        starbucksCoffee.add(new Coffee(4, "dolce cold brew", true));
        starbucksCoffee.add(new Coffee(5, "vanilla cream cold brew", true));

        System.out.println("[caffe로 시작하는 커피]");
        starbucksCoffee.stream()
                .filter(c -> c.getName().startsWith("caffe"))
                .forEach(c -> System.out.println(c.getName()));

        System.out.println("[달지 않은 커피]");
        starbucksCoffee.stream()
                .filter(Predicate.not(Coffee::isSweet))
                .forEach(c -> System.out.println(c.getName()));

        System.out.println("[커피 이름만 모아서 스트림 만들기]");
        starbucksCoffee.stream()
                .map(Coffee::getName)
                .forEach(System.out::println);

        List<Coffee> twosomeCoffee = new ArrayList<>();
        twosomeCoffee.add(new Coffee(6, "cream caramel tea", true));
        twosomeCoffee.add(new Coffee(7, "royal milk tea shake", true));
        twosomeCoffee.add(new Coffee(8, "green tea latte", false));

        List<List<Coffee>> coffees = new ArrayList<>();
        coffees.add(starbucksCoffee);
        coffees.add(twosomeCoffee);

        System.out.println("[두 커피 목록에 들어있는 모든 커피 아이디 출력]");
        coffees.stream()
                .flatMap(Collection::stream)
                .forEach(c -> System.out.println(c.getId()));

        System.out.println("[투썸 커피 중에 caramel이 들어있는 있는지 확인]");
        boolean caramel = twosomeCoffee.stream().anyMatch(c -> c.getName().contains("caramel"));
        System.out.println(caramel);

        System.out.println("[스타벅스 커피 중에 cole brew인 이름만 모아서 List로 만들기]");
        List<String> spring = starbucksCoffee.stream()
                .map(Coffee::getName)
                .filter(t -> t.contains("cold brew"))
                .collect(Collectors.toList());

        spring.forEach(System.out::println);


        System.out.println("[10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만]");
        Stream.iterate(10, i -> i + 1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);

    }
}

package com.janjanee;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(10));

        Function<Integer, Integer> plus20 = i -> i + 20;
        Function<Integer, Integer> multiple2 = i -> i * 2;
        System.out.println(plus20.apply(10));
        System.out.println(multiple2.apply(10));

        Function<Integer, Integer> multiple2AndPlus20 = plus20.compose(multiple2);
        System.out.println(multiple2AndPlus20.apply(5));

        Function<Integer, Integer> plus20AndMultiple2 = plus20.andThen(multiple2);
        System.out.println(plus20AndMultiple2.apply(5));

        Consumer<Integer> printT = i -> System.out.println(i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 1000;
        System.out.println(get10.get());

        Predicate<String> startsWithJ = s -> s.startsWith("j");
        Predicate<Integer> isOdd = i -> i % 2 == 1;
        System.out.println(startsWithJ.test("jan"));
        System.out.println(isOdd.test(4));

        UnaryOperator<Integer> plus50 = i -> i + 50;
        System.out.println(plus50.apply(50));
    }
}

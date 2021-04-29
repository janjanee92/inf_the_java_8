package com.janjanee;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {

        // 스태틱 메소드 참조
        UnaryOperator<String> hi = Greeting::hi;

        // 특정 객체의 인스턴스 메소드 참조
        Greeting greeting = new Greeting();
            UnaryOperator<String> hello = greeting::hello;

        // 기본 생성자 참조
        Supplier<Greeting> supplier = Greeting::new;

        // name 인자 받는 생성자 참조
        Function<String, Greeting> function = Greeting::new;

        // 임의의 객체에 인스턴스 메소드 참조 (스태틱 메소드 참조 아님)
        String[] names = {"jihan", "janjanee", "jibi"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

    }
}

package com.janjanee;

import java.util.Arrays;
import java.util.stream.Stream;

@Chicken("양념")
@Chicken("후라이드")
public class App {

    public static void main(String[] args) {
        Chicken[] chickens = App.class.getAnnotationsByType(Chicken.class);
        Stream.of(chickens).forEach(c -> System.out.println(c.value()));

        ChickenContainer chickenContainer = App.class.getAnnotation(ChickenContainer.class);
        Arrays.stream(chickenContainer.value()).forEach( c -> System.out.println(c.value()));
    }

}

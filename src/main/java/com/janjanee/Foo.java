package com.janjanee;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();
    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber);     //  11
            }
        }

        // 익명 클래스
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);     //  100
            }
        };

        // 람다
        IntConsumer printInt = i -> System.out.println(i + baseNumber);

        LocalClass localClass = new LocalClass();
        localClass.printBaseNumber();

        consumer.accept(100);
        printInt.accept(10);

    }
}

package com.janjanee;


public interface Foo  {

    void printValue();

    /**
     * @implSpec
     * getValue()으로 가져온 문자열을 소문자로 바꿔 출력한다.
     */
    default void printValueLowerCase() {
        System.out.println(getValue().toLowerCase());
    }

    default void print() {
        System.out.println("foo");
    }

    String getValue();

    static void printHello() {
        System.out.println("Hello");
    }
}

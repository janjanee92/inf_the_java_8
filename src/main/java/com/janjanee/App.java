package com.janjanee;

public class App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("Hello");
        foo.printValue();
        foo.printValueLowerCase();
        Foo.printHello();
    }
}

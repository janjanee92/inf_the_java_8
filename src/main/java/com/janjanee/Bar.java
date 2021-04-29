package com.janjanee;

public interface Bar {

    default void print() {
        System.out.println("bar");
    }

}

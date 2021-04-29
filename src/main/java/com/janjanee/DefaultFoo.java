package com.janjanee;

public class DefaultFoo implements Foo, Bar{

    String value;

    public DefaultFoo(String value) {
        this.value = value;
    }

    @Override
    public void printValue() {
        System.out.println(this.value);
    }

    @Override
    public void print() {
        System.out.println();
    }

    @Override
    public String getValue() {
        return this.value;
    }

}

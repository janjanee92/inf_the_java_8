package com.janjanee;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.OptionalInt;

public class Sample2 {
    public static void main(String[] args) {
        String str = "abc";
        Optional<String> opt1 = Optional.of(str);
        Optional<String> opt2 = Optional.ofNullable(str);
        Optional<String> opt3 = Optional.empty();

        OptionalInt optionalInt = OptionalInt.of(10);
        OptionalInt optionalInt1 = OptionalInt.empty();
        System.out.println(optionalInt.isPresent());
        System.out.println(optionalInt1.isPresent());
        System.out.println(optionalInt.getAsInt());

    }
}

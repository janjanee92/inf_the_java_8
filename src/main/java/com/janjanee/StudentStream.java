package com.janjanee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StudentStream {
    public static void main(String[] args) {

        Stream<Student> studentStream = Stream.of(
                new Student("강낭콩", true, 1, 1, 100),
                new Student("김자바", false, 1, 1, 90),
                new Student("이자바", true, 1, 1, 88),
                new Student("박자바", true, 1, 2, 75),
                new Student("조자바", true, 1, 2, 50),
                new Student("송자바", true, 1, 2, 100),

                new Student("윤자바", false, 2, 1, 67),
                new Student("최자바", true, 2, 1, 80),
                new Student("정자바", true, 2, 1, 99),
                new Student("오자바", true, 2, 2, 100),
                new Student("손자바", false, 2, 2, 50),
                new Student("자바", true, 2, 2, 30)
        );

        Map<Student.Level, Long> stdByLevel = studentStream
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 90) return Student.Level.HIGH;
                    else if (s.getScore() >= 70) return Student.Level.MID;
                    else return Student.Level.LOW;
                }, counting()));



    }
}

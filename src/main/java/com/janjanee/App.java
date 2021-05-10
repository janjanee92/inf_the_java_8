package com.janjanee;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate nextYearBirthday = LocalDate.of(2022, Month.MARCH, 2);

        Period period = Period.between(nextYearBirthday, today);
        System.out.println("생일까지 " + period.getYears() + "년" + period.getMonths() + "개월" + period.getDays() + "일 남았습니다.");


        LocalDate teacherDay = LocalDate.of(2021, Month.MAY, 15);

        Period until = today.until(teacherDay);
        System.out.println("생일까지 " + ChronoUnit.DAYS.between(today, nextYearBirthday) + "일 남았습니다.");

    }

}

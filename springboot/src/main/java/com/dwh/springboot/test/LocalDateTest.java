package com.dwh.springboot.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {
        String str = "2020-02-25";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(str,fmt);
        System.out.println(date.lengthOfMonth());
        System.out.println(date.plusMonths(1));
        System.out.println(date.plusWeeks(1));
        System.out.println(date.minusDays(6));
    }
}

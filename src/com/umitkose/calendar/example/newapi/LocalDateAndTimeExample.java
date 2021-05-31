package com.umitkose.calendar.example.newapi;
/*
 * Created by umitkose
 * 30.05.2021 - 21:29
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAndTimeExample {
    public static void main(String[] args) {
        LocalDate localDate= LocalDate.now();

        LocalDate localDate1= LocalDate.now();
        System.out.println(localDate);//2021-05-30

        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));

    }
}

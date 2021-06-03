package com.umitkose.calendar.example;
/*
 * Created by umitkose
 * 31.05.2021 - 17:34
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ExampleNewApi {

    public static void main(String[] args) {

        //Formatlı olarak bugünün zamanını almak.
        ExampleNewApi exampleNewApi = new ExampleNewApi();
        exampleNewApi.getTodayDateandTime();

        //belirli bir tarihi almak için
        exampleNewApi.getDefineDate();

        //belirli biz saati almak
        exampleNewApi.getDefineTime();


        LocalDate date1 = LocalDate.now();

        LocalDate date2 =
                LocalDate.of(2014, Month.DECEMBER, 12);

        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates "+
                "is a period of "+gap);

    }

    private void getTodayDateandTime() {
        //LocalDateTime.now() ile XML Gregorian olarak bugünün tarihi alırız.
        String localDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"));
        System.out.println(localDateTime);
    }

    private void getDefineDate() {
        String localDateTime = LocalDate.of(1993, 1, 1).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(localDateTime);
    }

    private void getDefineTime() {
        String localDateTime = LocalTime.of(12, 0).format(DateTimeFormatter.ofPattern("hh-mm"));
        System.out.println(localDateTime);
    }





}

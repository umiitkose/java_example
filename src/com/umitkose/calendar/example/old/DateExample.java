package com.umitkose.calendar.example.old;
/*
 * Created by umitkose
 * 30.05.2021 - 17:57
 */

import java.util.Date;

public class DateExample {
    public static void main(String[] args) throws InterruptedException {

        Date date = new Date();
        System.out.println(date);

        Thread.sleep(1000);
        Date date2 = new Date();
        System.out.println(date2);

        System.out.println(date.after(date2));
        System.out.println(date.before(date2));
    }
}

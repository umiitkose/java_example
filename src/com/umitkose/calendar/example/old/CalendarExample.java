package com.umitkose.calendar.example.old;
/*
 * Created by umitkose
 * 30.05.2021 - 18:08
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

        calendar.add(Calendar.HOUR,3);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));


    }
}

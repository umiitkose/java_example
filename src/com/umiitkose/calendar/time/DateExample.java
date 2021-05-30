package com.umiitkose.calendar.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {
    public static void main(String[] args) {
        DateExample date = new DateExample();
        date.DateExp();
    }

    private void DateExp() {
        Date date = new Date();
        Date date1 = new Date();
        date1.setTime(1321313);
        System.out.println(date.getTime());
        System.out.println(date.after(date1));
        System.out.println(date.before(date1));

    }

    private void CalenderExp(){
        Calendar cal = new GregorianCalendar();

    }

}

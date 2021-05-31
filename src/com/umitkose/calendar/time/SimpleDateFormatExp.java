package com.umitkose.calendar.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDateFormatExp {
//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();

        Date date = cal.getTime();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-dd-MM");
        System.out.println(simpleDateFormat.format(date));
    }
}

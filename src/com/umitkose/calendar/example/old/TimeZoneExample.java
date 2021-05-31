package com.umitkose.calendar.example.old;
/*
 * Created by umitkose
 * 30.05.2021 - 18:48
 */

import java.util.*;

public class TimeZoneExample {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        System.out.println(cal.getTimeZone());
        Locale locale = new Locale("tr");
        //Tüm Time Zoneları sıralayalım.
        String[] timeZones = TimeZone.getAvailableIDs();
        for(String timeZone:timeZones){
            if (timeZone.contains("America/New_York")){
            System.out.println(timeZone);}
        }

        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        TimeZone timeZoneTr = TimeZone.getTimeZone("Europe/Istanbul");
        cal.setTimeZone(timeZone);
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(Calendar.getInstance(timeZone));

        cal.setTimeZone(timeZoneTr);
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(Calendar.getInstance(timeZoneTr));

    }

}

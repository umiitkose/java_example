package com.umiitkose.calendar.example.old;
/*
 * Created by umitkose
 * 30.05.2021 - 18:42
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = new Date();

        System.out.println(simpleDateFormat.format(date));


    }
}

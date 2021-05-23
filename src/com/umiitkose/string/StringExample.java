package com.umiitkose.string;
/*
 * Created by umitkose
 * 8.05.2021 - 10:34
 */

public class StringExample {


    public static void main(String[] args) {
        //String dizisi içerisinde String.join ile istediğimiz gibi o dizi arasına veri atabiliriz.
        StringExample stringExample=new StringExample();
        String[] stringBirlestir = {"Ümit","KÖSE","28"};
        System.out.println(stringExample.kelimeBirlestir(stringBirlestir));




    }

    private String kelimeBirlestir(String[] deger){
        String names1 = String.join(" and ", "Ali", "Veli", "49", "50");
        System.out.println(names1);

        return String.join(", ",deger);
    }
}

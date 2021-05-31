package com.umitkose.example.example1;
/*
 * Created by umitkose
 * 19.05.2021 - 17:13
 */

public class Main {
    public static void main(String[] args) {
        Player futbolcu=new FootballPlayer("Ümit","KÖSE",28,"Forvet",true);
        futbolcu.isPlay();
        System.out.println(futbolcu.age);
    }
}

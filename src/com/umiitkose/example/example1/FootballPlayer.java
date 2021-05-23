package com.umiitkose.example.example1;
/*
 * Created by umitkose
 * 19.05.2021 - 17:05
 */

public class FootballPlayer extends Player{


    public FootballPlayer(String name, String surName, int age, String mevki, boolean injury) {
        super(name, surName, age, mevki, injury);
    }

    @Override
    public Boolean isPlay() {
        if(injury){
            System.out.println("Oynayamaz.");
            return false;
        }else{
            System.out.println("Oynar");
            return true;
        }
    }
}

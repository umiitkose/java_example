package com.umiitkose.example.example1;
/*
 * Created by umitkose
 * 19.05.2021 - 17:04
 */


public abstract class Player {

    protected String name;
    protected String surName;
    protected int age;
    protected String mevki;
    protected boolean injury;

    public Player(String name, String surName, int age, String mevki, boolean injury) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.mevki = mevki;
        this.injury = injury;
    }

    public abstract Boolean isPlay();

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", mevki='" + mevki + '\'' +
                ", injury=" + injury +
                '}';
    }


}

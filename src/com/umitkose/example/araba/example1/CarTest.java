package com.umitkose.example.araba.example1;
/*
 * Created by umitkose
 * 29.05.2021 - 17:14
 */

public class CarTest {
    public static void main(String[] args) {

        Car kadjar = new Renault(2017, "Kadjar", Vites.OTOMATIK);
        kadjar.calistir();
        kadjar.gazaBas();
        kadjar.gazaBas();
        kadjar.frenYap();
        kadjar.frenYap();
        kadjar.frenYap();
        kadjar.vitesBosaAl();
        kadjar.kapat();

    }
}

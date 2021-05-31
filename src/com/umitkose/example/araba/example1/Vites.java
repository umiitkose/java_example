package com.umitkose.example.araba.example1;
/*
 * Created by umitkose
 * 29.05.2021 - 17:19
 */

enum Vites {
    MANUEL(0,"Manuel"), YARIOTOMATIK(1,"Yarı Otomatik"), OTOMATIK(2, "Otomatik");

    private int vitesType;
    private String vitesAdi;
    private Vites(int vitesType,String vitesAdi) {
        this.vitesType = vitesType;
        this.vitesAdi = vitesAdi;
    }

    int getVitesCount() {
        return vitesType;
    }

    String getVitesAdi(){
        return vitesAdi;
    }


}

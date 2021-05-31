package com.umitkose.example.araba.example1;
/*
 * Created by umitkose
 * 29.05.2021 - 16:45
 */

public abstract class Car {

    private boolean motor = false;
    private int hiz = 0;
    private int year;
    private String model;
    private Vites vites;
    private Boolean vitesAlindiMi = false;

    public Car(int year, String model, Vites vites) {
        this.year = year;
        this.model = model;
        this.vites = vites;
    }

    int frenYap() {
        if (hiz > 0) {
            hiz--;
            System.out.println("Arabanın hızı : " + hiz);
        } else {
            System.out.println("Araba durdu, Motor Çalışıyor.");
            hiz = 0;
        }
        return hiz;
    }

    int gazaBas() {
        if (vites.getVitesCount() == Vites.MANUEL.ordinal()) {
            if (vitesBosaAl()) {
                System.out.println("Arabanın Vitese alınması gerekiyor.");
            } else {
                hiz++;
            }
        } else {
            hiz++;
        }
        System.out.println("Arabanın hızı : " + hiz);
        return hiz;
    }

    void calistir() {
        motorAc();
        System.out.println("Araba Çalıştırıldı");
    }

    void kapat() {
        motorKapat();
        System.out.println("Araba durdu..");
    }

    private boolean motorAc() {
        System.out.println("Arabanın motoru çalıştı.");
        return motor = true;
    }

    private boolean motorKapat() {
        System.out.println("Arabanın motoru kapandı.");
        return motor = false;
    }

    public boolean vitesiAl() {
        if (!vitesAlindiMi) {
            vitesAlindiMi = true;
        }
        return vitesAlindiMi;
    }

    public boolean vitesBosaAl() {
        if (vitesAlindiMi) {
            vitesAlindiMi = false;
        }
        return vitesAlindiMi;
    }

}

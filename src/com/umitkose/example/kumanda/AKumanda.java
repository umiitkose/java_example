package com.umitkose.example.kumanda;
/*
 * Created by umitkose
 * 1.06.2021 - 22:22
 */

public class AKumanda implements Kumanda {
    @Override
    public void televizyonAc(TV tv) {
        if (!tv.isTelevizyonAcikMi()) {
            tv.setTelevizyonAcikMi(true);
            System.out.println("Televizyon Açıldı..");
        } else
            System.out.println("Televizyon zaten açık..");
    }

    @Override
    public void televizyonKapat(TV tv) {
        if (tv.isTelevizyonAcikMi()) {
            tv.setTelevizyonAcikMi(false);
            System.out.println("Televizyon Kapatıldı..");
        } else
            System.out.println("Televizyon zaten kapalı..");
    }

    @Override
    public void kanalDegistir(TV tv) {
        tv.kanalDegistir(tv);

    }
}

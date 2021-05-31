package com.umiitkose.example.account;
/*
 * Created by umitkose
 * 30.05.2021 - 16:53
 */

import java.util.Date;

abstract class Account {

    int id;
    String name;
    String surname;
    final Date hesapAcilisTarihi;
    int bakiye = 0;

    public Account(int id, String name, String surname, Date hesapAcilisTarihi, int bakiye) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.hesapAcilisTarihi = hesapAcilisTarihi;
        this.bakiye = bakiye;
    }

    public void deposit(int id, int miktar) {
        this.bakiye += miktar;
        System.out.println("Paranız yatmıştır, Mevcut Bakiyeniz : " + bakiye);
    }

    public void withDraw(int id, int miktar) {

        if (bakiye <= 0) {
            System.out.println("Bakiyeniz 0'dır. Para Çekmek için öncelikle para yatırılmalıdır.");
        } else if (miktar > bakiye) {
            System.out.println("Bakiyeniz : " + bakiye + " kadardır. Çekmek istediğiniz " + miktar + " Mevcut bakiyeden fazladır. İşlem gerçekleştirilemiyor..");
        } else {
            bakiye -= miktar;
        }
    }

    public int getBalance() {
        return bakiye;
    }

    public int getId() {
        return id;
    }

    //Calendar dersi sonrası halledecez..
    public void benefit(Long islemTarihi) {
        Long hesapAcilisTarihiTime = hesapAcilisTarihi.getTime();
        hesapAcilisTarihiTime -=islemTarihi;
    }

}

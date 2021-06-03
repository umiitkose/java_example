package com.umitkose.example.account;
/*
 * Created by umitkose
 * 30.05.2021 - 16:53
 */

abstract class Account {

    private int id;
    private String name;
    private String surname;
    private String hesapAcilisTarihi;
    private int bakiye = 0;


    public Account(int id, String name, String surname, String hesapAcilisTarihi, int bakiye) {
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
        try {
            if (bakiye <= 0) {
                System.out.println("Bakiyeniz 0'dır. Para Çekmek için öncelikle para yatırılmalıdır.");
            } else if (miktar > bakiye) {
                System.out.println("Bakiyeniz : " + bakiye + " kadardır. Çekmek istediğiniz " + miktar + " Mevcut bakiyeden fazladır. İşlem gerçekleştirilemiyor..");
            } else {
                bakiye -= miktar;
            }
        }catch (BakiyeException e){
            e.printStackTrace();
        }
    }

    public int getBalance() {
        return bakiye;
    }

    public int getId() {
        return id;
    }

    abstract double benefit(Account account);

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHesapAcilisTarihi() {
        return hesapAcilisTarihi;
    }

    public void setHesapAcilisTarihi(String hesapAcilisTarihi) {
        this.hesapAcilisTarihi = hesapAcilisTarihi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }


}

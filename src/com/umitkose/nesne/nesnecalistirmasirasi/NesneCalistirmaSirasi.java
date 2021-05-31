package com.umitkose.nesne.nesnecalistirmasirasi;

public class NesneCalistirmaSirasi {


    public static void main(String[] args) {
        NesneOrnegi nesne;
        System.out.println(NesneOrnegi.i);
        System.out.println("*****---*****");
        nesne= new NesneOrnegi();

        //System.out.println(nesne.deger);

    }
}

class NesneOrnegi{

    static int i = 0;
    int deger = 0;
    static{
        System.out.println("Static Bloğu Çalıştı");
        int i=5;
        System.out.println(i);
    }

    {
        System.out.println("Nesne Bloğu Çalıştı");
        System.out.println(deger);
    }

    public NesneOrnegi(){
        System.out.println("Nesne Ornegi Constructor Çalıştı");
    }

}

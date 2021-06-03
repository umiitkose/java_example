package com.umitkose.example.kumanda;
/*
 * Created by umitkose
 * 1.06.2021 - 22:17
 */

/*
 * İstenilenler :
 * Bir tane kumanda interface'i oluştur. 2 tane kumanda firmamız olacak.
 * 1-> firma kumanda ile televizyon açabilir, kanal değiştirir, televizyon kapayabilir.
 * 2-> firma kumanda ile televizyon açar, ses açar, ses azaltır, kanal değiştirir, televizyon kapayabilir.
 * Ekranda ses açma, ses azaltma sayıları görünmeli. Kanal değişince yeni kanal görünmeli.
 * Ek olarak TV nesnesi oluştur. içerisinde kanal adı ve program yazsın.
 *
 * */


public class Main {
    public static void main(String[] args) {

        TV tv = new TV();

        Kumanda aKumanda = new AKumanda();
        aKumanda.kanalDegistir(tv);
        aKumanda.televizyonKapat(tv);
        aKumanda.televizyonAc(tv);
        aKumanda.kanalDegistir(tv);
        aKumanda.televizyonKapat(tv);


    }


}

package com.umitkose.fonksiyonelprogramlama.language;
/*
 * Created by umitkose
 * 27.06.2021 - 21:35
 */

import java.util.Locale;

public class SelamlamaMain {

    public static void main(String[] args) {
        //istersen Locale.getDefault().getCountry() ile de alabilirsin fakat Typesafe için
        Selamlama selamlama = (String language) -> {
            String kelime;
            if (language.equals(Language.AR.key)) {
                kelime = "arapca Merhaba";
            } else if (language.equals(Language.EN.key)) {
                kelime = "ingilizce Merhaba";
            } else if (language.equals(Language.TR.key)) {
                kelime = "Türkçe Merhaba";
            } else {
                kelime = "bir hata mı oldu acaba ??";
            }
            return kelime;
        };

        selamlama(selamlama, Language.valueOf(Locale.getDefault().getCountry()));

    }

    public static void selamlama(Selamlama selam, Language language) {
        String selamlama = selam.selam(language.key);
        System.out.println(selamlama + " " + Locale.getDefault().getCountry());

    }
}

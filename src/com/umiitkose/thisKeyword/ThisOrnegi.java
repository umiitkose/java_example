package com.umiitkose.thisKeyword;

public class ThisOrnegi {
    int i=0;
    public ThisOrnegi() {
        System.out.println("İki kurucu this(…) ile karşılıklı olarak birbirlerini çağıramazlar." +
                "recursive çağırılmasına izin verilmediğinden hata alınır.Örnek için ilk yorum satırı");
       //this(1);
        System.out.println("this constructor 'da ilk çağırılmalı yoksa " +
                "Call to 'this()' must be first statement in constructor body hatası alınır. Yorum satırını kaldırabilirsin.");
        int a = 5;
        //this(a);

    }

    public ThisOrnegi(int i) {
        this();
        this.i = i;
    }
}

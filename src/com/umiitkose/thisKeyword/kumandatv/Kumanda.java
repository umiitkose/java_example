package com.umiitkose.thisKeyword.kumandatv;
/*
 * Created by umitkose
 * 30.05.2021 - 12:18
 */

public class Kumanda {

    boolean acKapaTusunaBas = false;

    TV tv;

    public Kumanda(boolean acKapaTusunaBas) {
        this.acKapaTusunaBas = acKapaTusunaBas;
    }

    public boolean isAcKapaTusunaBas() {
        return acKapaTusunaBas;
    }

    public void setAcKapaTusunaBas(boolean acKapaTusunaBas) {
        this.acKapaTusunaBas = acKapaTusunaBas;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }


}

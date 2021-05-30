package com.umiitkose.thisKeyword.kumandatv;
/*
 * Created by umitkose
 * 30.05.2021 - 12:18
 */

public class TV {

    boolean ac = false;
    boolean ekranGeldimi = false;
    Kumanda kumanda;

    public TV(boolean ac, boolean ekranGeldimi, Kumanda kumanda) {
        this.ac = ac;
        this.ekranGeldimi = ekranGeldimi;
        this.kumanda = kumanda;
    }
}

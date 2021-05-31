package com.umiitkose.thisKeyword.kumandatv;
/*
 * Created by umitkose
 * 30.05.2021 - 12:18
 */

public class TV {

    boolean ac = false;
    boolean ekranGeldimi = false;
    Kumanda kumanda;

    public TV(boolean ac, boolean ekranGeldimi) {
        this.ac = ac;
        this.ekranGeldimi = ekranGeldimi;
    }

    public TV(boolean ac, boolean ekranGeldimi, Kumanda kumanda) {
        this.ac = ac;
        this.ekranGeldimi = ekranGeldimi;
        kumanda.setTv(this);
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isEkranGeldimi() {
        return ekranGeldimi;
    }

    public void setEkranGeldimi(boolean ekranGeldimi) {
        this.ekranGeldimi = ekranGeldimi;
    }

    public Kumanda getKumanda() {
        return kumanda;
    }

    public void setKumanda(Kumanda kumanda) {
        this.kumanda = kumanda;
    }
}

package com.umitkose.example.kumanda;
/*
 * Created by umitkose
 * 1.06.2021 - 22:29
 */

public class Program {
    private String kanalAdi;
    private String programAdi;
    private int kanalNumarasi;

    public Program(String kanalAdi, String programAdi, int kanalNumarasi) {
        this.kanalAdi = kanalAdi;
        this.programAdi = programAdi;
        this.kanalNumarasi = kanalNumarasi;
    }

    public String getKanalAdi() {
        return kanalAdi;
    }

    public void setKanalAdi(String kanalAdi) {
        this.kanalAdi = kanalAdi;
    }

    public String getProgramAdi() {
        return programAdi;
    }

    public void setProgramAdi(String programAdi) {
        this.programAdi = programAdi;
    }

    public int getKanalNumarasi() {
        return kanalNumarasi;
    }

    public void setKanalNumarasi(int kanalNumarasi) {
        this.kanalNumarasi = kanalNumarasi;
    }
}

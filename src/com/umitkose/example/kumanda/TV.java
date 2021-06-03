package com.umitkose.example.kumanda;
/*
 * Created by umitkose
 * 1.06.2021 - 22:20
 */

import java.util.ArrayList;
import java.util.List;

public class TV {

    private boolean televizyonAcikMi = false;
    private List<Program> program;

    public TV() {
        this.tvProgramYukle();
    }

    public boolean isTelevizyonAcikMi() {
        return televizyonAcikMi;
    }

    public void setTelevizyonAcikMi(boolean televizyonAcikMi) {
        this.televizyonAcikMi = televizyonAcikMi;
    }

    public List<Program> getKanalListesi() {
        return program;
    }

    public void setKanalListesi(List<Program> program) {
        this.program = program;
    }

    public void kanalDegistir(TV tv) {
        if (televizyonAcikMi) {
            int randomKanal = (int) (Math.random() * this.getKanalListesi().size());
            System.out.println("Yeni Kanal Listesi : " + tv.getKanalListesi().get(randomKanal).getKanalAdi());
        } else
            System.out.println("televizyon açılmalıdır.");

    }

    public void tvProgramYukle() {
        Program program = new Program("atv", "b", 1);
        Program program2 = new Program("show", "c", 2);
        List<Program> list = new ArrayList<>();
        list.add(program);
        list.add(program2);
        this.setKanalListesi(list);
    }
}

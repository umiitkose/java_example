package com.umiitkose.polimorfizm.latebinding;
/*
 * Created by umitkose
 * 14.05.2021 - 12:43
 */

public class Rectangle extends Shape {
    int kisaKenar, uzunKenar;

    public Rectangle(int kisaKenar, int uzunKenar) {
        this.kisaKenar=kisaKenar;
        this.uzunKenar=uzunKenar;
        System.out.println("Rectangle Çalıştı.");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle erase");
    }

    @Override
    public int calculateArea() {
        return kisaKenar * uzunKenar;
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Rectangle calculate");
    }
}

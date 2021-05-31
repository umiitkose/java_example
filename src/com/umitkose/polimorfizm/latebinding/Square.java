package com.umitkose.polimorfizm.latebinding;
/*
 * Created by umitkose
 * 14.05.2021 - 12:43
 */

public class Square extends Shape {

    int kenar;

    public Square(int kenar) {
        this.kenar = kenar;
        System.out.println("Square Çalıştı.");
    }

    @Override
    public void draw() {
        System.out.println("Squeare draw");
    }

    @Override
    public void erase() {
        System.out.println("Squeare erase");
    }

    @Override
    public int calculateArea() {
        return kenar * kenar;
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Squeare calculate");
    }
}

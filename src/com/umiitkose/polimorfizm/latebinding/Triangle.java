package com.umiitkose.polimorfizm.latebinding;
/*
 * Created by umitkose
 * 14.05.2021 - 12:43
 */

public class Triangle extends Shape {

    int kenarA, kenarB;

    public Triangle(int kenarA, int kenarB) {
        this.kenarA = kenarA;
        this.kenarB = kenarB;
        System.out.println("Triangle Çalıştı.");
    }

    @Override
    public void draw() {
        System.out.println("Triangle draw");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase");
    }

    @Override
    public int calculateArea() {
        return (kenarA * kenarB) / 2;
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Triangle calculate");
    }
}

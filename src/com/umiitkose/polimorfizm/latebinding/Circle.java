package com.umiitkose.polimorfizm.latebinding;
/*
 * Created by umitkose
 * 14.05.2021 - 12:42
 */

public class Circle extends Shape {

    double PI = Math.PI;
    int yaricap;

    public Circle(int yaricap) {
        this.yaricap = yaricap;
        System.out.println("Circle Çalıştı.");
    }

    @Override
    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase");
    }

    @Override
    public int calculateArea() {
        return (int) PI * yaricap * yaricap;
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Circle calculate");
    }
}

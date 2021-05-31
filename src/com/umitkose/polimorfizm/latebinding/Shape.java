package com.umitkose.polimorfizm.latebinding;
/*
 * Created by umitkose
 * 14.05.2021 - 12:42
 */

public class Shape {

    int a= 5 ;

    public Shape() {
        System.out.println("Shape Çalıştı.");
    }

    public void draw(){
        System.out.println("Shape için Draw çalıştı.");
    }

    public void erase(){
        System.out.println("Shape için erase çalıştı.");
    }

    public int calculateArea(){
        return 0;
    }

    public void calculateCircumference(){
        System.out.println("Shape için Draw çalıştı.");
    }

}

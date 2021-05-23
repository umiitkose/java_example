package com.umiitkose.polimorfizm.latebinding;
/*
 * Created by umitkose
 * 14.05.2021 - 13:22
 */

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape();
        System.out.println(shape.calculateArea());


    }
}

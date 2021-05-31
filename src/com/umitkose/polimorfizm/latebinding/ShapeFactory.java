package com.umitkose.polimorfizm.latebinding;
/*
 * Created by umitkose
 * 14.05.2021 - 12:48
 */

public class ShapeFactory {

    public ShapeFactory() {
    }

    public Shape createShape() {
        Shape shape = null;
        int i = (int) (Math.random() * 5);
        switch (i) {
            case 1:
                shape = new Square(2);
                break;
            case 2:
                shape = new Circle(3);
                break;
            case 3:
                shape = new Triangle(2, 4);
                break;
            case 4:
                shape = new Rectangle(2, 5);
                break;
            case 5:
                shape = new Shape();
                break;
            default:
                shape = new Shape();
                break;

        }
        return shape;
    }
}

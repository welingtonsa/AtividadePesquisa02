package com.edu.AbstractFactory;

public class RectangleFactory {

    public static MyRectangle create(double sideA, double sideB) {
        if(sideA != 0 && sideB != 0) {
            return new MyRectangle(sideA, sideB);
        } else return null;
    }
    
}

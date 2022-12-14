package com.edu.AbstractFactory;

public class AbstractFactory {
    public static IFigure create(double a, double b, Figure figure){
        switch (figure) {
            case RETANGULO: return RectangleFactory.create(a,b);
            case SQUARE: return SquareFactory.create(a,b);
            default: return null;
        }
    }
}

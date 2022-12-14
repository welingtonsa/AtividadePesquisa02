package com.edu.AbstractFactory;

public class Square extends Rectangle implements IFigure{
    /* Atributos da classe quadrado */
    private double sideA;
    private double sideB;

    /* metodos construtores da classe quadrado*/
    public Square(){}
    public Square(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getWriteRadius(){
        return this.getDiagonal()/2;
    }

    public double getReadRadius(){
        return this.sideA / 2;
    }


    /* MEtodosgetters and setters da classe quadrado */
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    /* to string */
    public String toString() {
        return "Square{" +
                "side=" + sideA +
                " area=" + super.getArea() +
                " perimeter=" + super.getPerimeter() +
                " Es radius=" + getWriteRadius() +
                " In radius=" + getReadRadius() +
                '}';
    }

    
}

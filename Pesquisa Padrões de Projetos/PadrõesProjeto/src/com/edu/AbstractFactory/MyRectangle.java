package com.edu.AbstractFactory;

public class MyRectangle extends Rectangle implements IFigure{
    /* Atributos da classe MyRetangulo */
    private double sideA;
    private double sideB;

    /* Metodos construtores da classe MyRetangulo */
    public MyRectangle(){}
    public MyRectangle(double sideA, double sideB){
        super(sideA, sideB);
        this.sideA = sideA;
        this.sideB = sideB; 
    }

    /* MEtodos getters and setters da classe Myretangulo */
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

    
    
}

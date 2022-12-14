package com.edu.AbstractFactory;

public abstract class Rectangle {
    /* Atributos da classe abstrta Retangulo */
    private double sideA;
    private double sideB;

    /* MEtodos construtores */
    public Rectangle(){}
    public Rectangle( double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /* Metodos da classe Retangulo */
    public double getPerimeter(){
        return this.sideA * 2 + this.sideB * 2;
    }

    public double getArea(){
        return this.sideA * sideB;
    }

    public double getDiagonal(){
        return Math.sqrt(this.sideA * this.sideB + this.sideB * this.sideB);
    }



    /* MEtodos getters and setters da classe Retangulo */
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

    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                ", diagonal=" + this.getDiagonal();
    }

    

    
    
}

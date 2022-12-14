package com.edu.AbstractFactory;

public class ModelRectangle {
    /*Atributos da classe ModelRetangulo */
    private MyRectangle MyRectangle;
    private int variant;
    private String name;

    /* MEtodos construtores da classe ModelRetangulo */
    public ModelRectangle(){}
    public ModelRectangle(MyRectangle MyRectangle, int variant, String name){
        this.MyRectangle = MyRectangle;
        this.variant = variant;
        this.name = name;
    }

    /* Metodos getters and setters da classe Model Retangulo */
    public MyRectangle getMyRectangle() {
        return MyRectangle;
    }
    public void setMyRectangle(MyRectangle myRectangle) {
        MyRectangle = myRectangle;
    }
    public int getVariant() {
        return variant;
    }
    public void setVariant(int variant) {
        this.variant = variant;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "ModelRetangulo{ " + 
            "Retangulo = " + MyRectangle + 
            ", Outro modelo = " + variant + 
            ", Nome = " + name + '\'' +
            '}';
    }

}

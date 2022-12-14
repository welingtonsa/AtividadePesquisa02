package com.edu.Singletom;

public final class SingleTomClass {
    /* Atributos da classe Single tom */
    private static final SingleTomClass singleObj = new SingleTomClass();
    public String name;

    /* MEtodos construstor da classe Singletom */
    private SingleTomClass(){}

    /* MEtodos da classe singleTom */
    public static SingleTomClass getInstance(){
        return singleObj;
    }

    public String getDetailOfClass() {
		return "Isso é uma classe Singletom";
	}
	@Override
	public String toString() {
		return this.name;
	}

}

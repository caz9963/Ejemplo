package com.mycompany.areaperimetro;

public class Triangulo extends FiguraGeometrica {

    double base;
    double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarCalculo() {
        double area=(base*altura)/2;
        double perimetro=base*3;
        
        System.out.println("El area del triangulo es de: "+area);
        System.out.println("El perimetro del triangulo es de: "+perimetro);

    }

}

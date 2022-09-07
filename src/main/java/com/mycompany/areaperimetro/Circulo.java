package com.mycompany.areaperimetro;

public class Circulo {

    double radio;
    double pi;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void mostrarCalculo() {
        double area=Math.PI * Math.pow(radio,2);
        double perimetro=2*Math.PI*radio;
        
        System.out.println("El area del circulo es de: "+area);
        System.out.println("El perimetro del circulo es de: "+perimetro);

    }

}

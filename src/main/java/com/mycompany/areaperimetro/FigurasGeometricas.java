package com.mycompany.areaperimetro;

public class FigurasGeometricas {

    public static void main(String[] args) {
        FiguraGeometrica Figura= new FiguraGeometrica();
        
        Figura.setColor("Rojo");
        
        Figura.calcularArea();
        Figura.calcularPerimetro();
        
        
        Triangulo T = new Triangulo();
        T.setAltura(12);
        T.setBase(11);
        T.mostrarCalculo();
        
        Circulo C = new Circulo();
        C.setRadio(5);
        C.mostrarCalculo();
        
        Cuadrado cu= new Cuadrado();
        cu.setLado(23);
        cu.mostrarCalculo();
    }
}

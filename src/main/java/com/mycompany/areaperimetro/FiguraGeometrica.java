package com.mycompany.areaperimetro;

public class FiguraGeometrica implements AreaPerimetro {

    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void calcularArea() {
        System.out.println("Calcular el area de la figura de color: "+color);
        
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Calcular el Perimetro de la figura de color: "+color);

    }

}

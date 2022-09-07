
package com.mycompany.areaperimetro;

public class Cuadrado {
    double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public void mostrarCalculo() {
        double area=Math.pow(lado,2);
        double perimetro=(lado*4);
        
        System.out.println("El area del cuadrado es de: "+area);
        System.out.println("El perimetro del cuadrado es de: "+perimetro);

    }
    
    
}

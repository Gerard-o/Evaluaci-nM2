
package com.mycompany.figuras;


public class círculo extends FiguraGeometrica{
private double radio ;
private double pi = 3.14159265359;
      public círculo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

   @Override
    public double calcularArea() {
        return pi * radio * radio;
    }
}

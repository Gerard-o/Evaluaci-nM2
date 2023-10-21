
package com.mycompany.figuras;


public class cuadrado extends FiguraGeometrica{
private double lado ;

      public cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

     @Override
    public double calcularArea() {
        return lado * lado;
    }
}

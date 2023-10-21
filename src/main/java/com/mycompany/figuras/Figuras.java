
package com.mycompany.figuras;


public class Figuras {

    public static void main(String[] args) {

cuadrado cua1 = new  cuadrado("verde", 1.5);
        
círculo cir1 = new  círculo("amarillo", 2.0);

        System.out.println("el area del cuadrado es :" + cua1.calcularArea()); 
        System.out.println("el color del cuadrado es :"+cua1.getColor());
        
        System.out.println("el area del circulo es : " + cir1.calcularArea());
        System.out.println("el color del circulo es"+ cir1.getColor());
        

    }
}

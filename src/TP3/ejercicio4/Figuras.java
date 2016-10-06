package TP3.ejercicio4;

import TP1.ejercicio2.Point2D;
import TP2.ejercicio1.Triangle;
import TP3.ejercicio3.Circle;
import TP3.ejercicio3.Figure;
import TP3.ejercicio3.Rectangle;

/**
 * Created by arimi on 25/08/2016.
 */
public class Figuras {
    public static void main (String[] args){
        Figure[] figuras = new Figure[5];

        Rectangle cuadrado = new Rectangle(2,2);
        figuras[0] = cuadrado;

        Circle circulo = new Circle(2);
        figuras[1] = circulo;

        Point2D p1 = new Point2D(0,0);
        Point2D p2 = new Point2D(2,0);
        Point2D p3 = new Point2D(1,1);
        TP3.ejercicio3.Triangle  triangulo = new TP3.ejercicio3.Triangle(p1,p2,p3);
        figuras[2]= triangulo;

        for (int i = 0; i < figuras.length;i++){
            if (figuras[i] instanceof Rectangle){
                Rectangle retangulo = (Rectangle)figuras[i];
                System.out.println("diagonal = " + retangulo.diagonal());
            }
        }
    }
}

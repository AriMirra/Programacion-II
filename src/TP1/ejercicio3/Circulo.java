package TP1.ejercicio3;

import TP1.ejercicio2.Point2D;

/**
 * Created by arimi on 11/08/2016.
 */
public class Circulo {
    private Point2D center;
    private double area;
    private double radio;

    public Circulo(Point2D center, double radio){
        this.center = center;
        this.radio = radio;
    }

    public Point2D center(){
        return center;
    }

    public double area(){
        return Math.PI*radio*radio;
    }

    public boolean contains(Point2D point){
        boolean containsPoint = false;
        if (point.getDistance(center) <= radio) containsPoint = true;
        return containsPoint;
        //la distancia de tu punto al center tiene q ser menor al radio
    }

    public double perimeter(){
        return Math.PI*radio*2;
    }
}

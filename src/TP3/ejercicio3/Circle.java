package TP3.ejercicio3;

/**
 * Created by arimi on 25/08/2016.
 */
public class Circle extends Figure{
    private double area;
    private double perimeter;
    private double radio;

    public Circle(double radio){
        this.radio = radio;
    }
    @Override
    public double area(){return Math.PI*radio*radio;}

    @Override
    public double perimeter(){return 2*Math.PI*radio;}



}

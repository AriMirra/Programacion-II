package TP3.ejercicio3;

/**
 * Created by arimi on 25/08/2016.
 */
public class Rectangle extends Figure {
    private double heigth;
    private double base;

    public Rectangle(Segment base, Segment sides) {
        this.base = base.getLength();
        this.heigth = sides.getLength();
    }

    public Rectangle(double base, double side) {
        this.base = base;
        this.heigth = side;
    }

    @Override
    public double perimeter(){
        return base * 2 + heigth * 2;
    }
    @Override
    public double area(){
        return base*heigth;
    }

    public double base(){return base;}
    public double heigth(){return heigth;}

    public double diagonal(){
        return Math.sqrt(base*base+heigth*heigth);
    }

}

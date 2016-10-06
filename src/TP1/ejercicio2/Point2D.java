package TP1.ejercicio2;

/**
 * Created by arimi on 11/08/2016.
 */
public class Point2D {
    private double x;
    private double y;
    public Point2D (double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point2D point){
        return Math.sqrt(Math.pow((point.getX()-x),2) + Math.pow((point.getY()-y),2));
    }

    public Point2D add(Point2D point){
        x += point.getX();
        y += point.getY();
        return this;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

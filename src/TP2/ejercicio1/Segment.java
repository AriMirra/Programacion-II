package TP2.ejercicio1;

import TP1.ejercicio2.Point2D;

/**
 * Created by arimi on 17/08/2016.
 */
public class Segment {
    private Point2D point1;
    private Point2D point2;
    private double length;

    public Segment(Point2D punto1, Point2D punto2){
        point1 = punto1;
        point2 = punto2;
        length = punto1.getDistance(punto2);
    }

    public double getLength(){
        return length;
    }


}

package TP2.ejercicio1;

import TP1.ejercicio2.Point2D;

/**
 * Created by arimi on 17/08/2016.
*/
public class Triangle {
    private Segment base;
    private Segment side1;
    private Segment side2;
    private Point2D A;
    private Point2D B;
    private Point2D C;

    public Triangle(Point2D p1, Point2D p2, Point2D p3){
        A = p1;
        B = p2;
        C = p3;
        base = new Segment(p1,p2);
        side1 = new Segment(p1,p3);
        side2 = new Segment(p2,p3);
    }

    public double area(){
        //Ax(By−Cy)+ Bx (Cy−Ay)+ Cx(Ay−By) / 2
        return Math.abs((A.getX()*(B.getY()-C.getY()) + B.getX()*(C.getY() - A.getY()) + C.getX()*(A.getY()-B.getY())) * 0.5);
    }

    public double perimeter(){
        return (base.getLength() + side1.getLength() + side2.getLength());
    }

    public boolean isIsoceles(){
        return !(this.isEquilateral() || this.isScalane());
    }

    public boolean isScalane(){
        return ((base.getLength() != side1.getLength()) && base.getLength() != side2.getLength()) && side1.getLength() != side2.getLength();
    }

    public boolean isEquilateral(){
        return ((base.getLength() == side1.getLength()) && base.getLength() == side2.getLength());
    }

}

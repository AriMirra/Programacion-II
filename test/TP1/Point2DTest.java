package TP1;

import TP1.ejercicio2.Point2D;
import junit.framework.TestCase;

/**
 * Created by arimi on 11/08/2016.
 */
public class Point2DTest extends TestCase {
    public void testGetDistance() throws Exception {
        Point2D punto = new Point2D(0,0);
        Point2D point = new Point2D(1,1);
        punto.getDistance(point);
        assertEquals(Math.sqrt(2),punto.getDistance(point),0.1);
    }

    public void testAdd() throws Exception {
        Point2D punto = new Point2D(0,0);
        Point2D point = new Point2D(1,1);
        punto.add(point);
        assertEquals(1, punto.getX(),0.1);
        assertEquals(1, punto.getY(),0.1);
    }

    public void testGetX() throws Exception {
        Point2D punto = new Point2D(0,0);
        double X = punto.getX();
        assertEquals(0,X,0.1);
    }

    public void testGetY() throws Exception {
        Point2D punto = new Point2D(0,0);
        double Y = punto.getY();
        assertEquals(0,Y,0.1);
    }

}
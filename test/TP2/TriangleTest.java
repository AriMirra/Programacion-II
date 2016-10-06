package TP2;

import TP1.ejercicio2.Point2D;
import TP2.ejercicio1.Triangle;
import junit.framework.TestCase;

/**
 * Created by arimi on 18/08/2016.
 */
public class TriangleTest extends TestCase {
    public void testArea() throws Exception {
        Point2D p1 = new Point2D(0,0);
        Point2D p2 = new Point2D(1,1);
        Point2D p3 = new Point2D(0,2);
        Triangle holis = new Triangle(p1,p2,p3);

        assertEquals(1, holis.area(), 0.1);

    }

    public void testPerimeter() throws Exception {
        Point2D p1 = new Point2D(0,0);
        Point2D p2 = new Point2D(1,1);
        Point2D p3 = new Point2D(0,2);
        Triangle holis = new Triangle(p1,p2,p3);

        assertEquals(4.8,holis.perimeter(),0.1);
    }

    public void testIsIsoceles() throws Exception {
        Point2D p1 = new Point2D(0,0);
        Point2D p2 = new Point2D(1,1);
        Point2D p3 = new Point2D(0,2);
        Triangle holis = new Triangle(p1,p2,p3);

        assertEquals(true,holis.isIsoceles());
    }

    public void testIsScalane() throws Exception {
        Point2D p1 = new Point2D(0,0);
        Point2D p2 = new Point2D(1,1);
        Point2D p3 = new Point2D(0,2);
        Triangle holis = new Triangle(p1,p2,p3);

        assertEquals(false,holis.isScalane());

    }

    public void testIsEquilateral() throws Exception {
        Point2D p1 = new Point2D(0,0);
        Point2D p2 = new Point2D(1,1);
        Point2D p3 = new Point2D(0,2);
        Triangle holis = new Triangle(p1,p2,p3);

        assertEquals(false,holis.isEquilateral());

    }

}
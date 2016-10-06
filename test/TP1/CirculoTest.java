package TP1;

import TP1.ejercicio2.Point2D;
import TP1.ejercicio3.Circulo;
import junit.framework.TestCase;

/**
 * Created by arimi on 12/08/2016.
 */
public class CirculoTest extends TestCase {
    public void testCenter() throws Exception {
        Point2D center = new Point2D(0,0);
        Circulo circle = new Circulo(center, 2);

        assertEquals(center,circle.center());
    }

    public void testArea() throws Exception {
        Point2D center = new Point2D(0,0);
        Circulo circle = new Circulo(center, 2);

        assertEquals(12.566, circle.area(),0.1);
    }

    public void testContains() throws Exception {
        Point2D center = new Point2D(0,0);
        Point2D estas = new Point2D(8,8);
        Circulo circle = new Circulo(center, 2);

        assertEquals(false,circle.contains(estas));
    }

    public void testPerimeter() throws Exception {
        Point2D center = new Point2D(0,0);
        Circulo circle = new Circulo(center, 2);

        assertEquals(12.566, circle.perimeter(), 0.1);
    }

}
package TP3.ejercicio3;

import junit.framework.TestCase;

/**
 * Created by arimi on 25/08/2016.
 */
public class EllipseTest extends TestCase {
    Ellipse holis = new Ellipse(1.5,2);
    public void testPerimeter() throws Exception {
        assertEquals(11.10,holis.perimeter(),0.1);
    }

    public void testArea() throws Exception {
        assertEquals(9.4245,holis.area(),0.1);
    }

}
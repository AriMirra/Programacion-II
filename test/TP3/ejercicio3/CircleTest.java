package TP3.ejercicio3;

import junit.framework.TestCase;

/**
 * Created by arimi on 25/08/2016.
 */
public class CircleTest extends TestCase {
    Circle holis = new Circle(2);
    public void testArea() throws Exception {
        assertEquals(12.566,holis.area(), 0.1);
    }

    public void testPerimeter() throws Exception {
        assertEquals(12.566,holis.perimeter(), 0.1);
    }

}
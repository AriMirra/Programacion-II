package TP3.ejercicio3;

import junit.framework.TestCase;

/**
 * Created by arimi on 25/08/2016.
 */
public class RectangleTest extends TestCase {
    Rectangle holis = new Rectangle(2,2);
    public void testPerimeter() throws Exception {
        assertEquals(8,holis.perimeter(), 0.1);

    }

    public void testArea() throws Exception {
        assertEquals(4,holis.area(),0.1);
    }

    public void testDiagonal() throws Exception {
        assertEquals(2.8, holis.diagonal(), 0.2);

    }

}
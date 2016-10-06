package TP1;

import TP1.ejercicio4.Interval;
import junit.framework.TestCase;

/**
 * Created by arimi on 13/08/2016.
 */
public class IntervalTest extends TestCase {
    public void testFirst() throws Exception {
        Interval intervalo = new Interval(5,2);
        assertEquals(2,intervalo.first());

    }

    public void testLast() throws Exception {
        Interval intervalo = new Interval(5,2);
        assertEquals(10, intervalo.last());

    }

    public void testAt() throws Exception {
        Interval intervalo = new Interval(5,2);
        assertEquals(8,intervalo.at(4));

    }

    public void testSize() throws Exception {
        Interval intervalo = new Interval(5,2);
        assertEquals(5,intervalo.size());

    }

}
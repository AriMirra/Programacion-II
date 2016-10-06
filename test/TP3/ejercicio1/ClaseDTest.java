package TP3.ejercicio1;

import junit.framework.TestCase;

/**
 * Created by arimi on 20/08/2016.
 */
public class ClaseDTest extends TestCase {
    public void testM1() throws Exception {
        ClaseD d = new ClaseD();
        assertEquals(3,d.m1(),0.1);

    }

    public void testM3() throws Exception {
        ClaseD d = new ClaseD();
        assertEquals(2,d.m3(),0.1);

    }

    public void testM5() throws Exception {
        ClaseD d = new ClaseD();
        assertEquals(20,d.m5(),0.1);

    }
}
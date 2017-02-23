package TP3.ejercicio1;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by arimi on 22-Feb-17.
 */
public class ClaseCTest extends TestCase {
    public void testm1() throws Exception {
        ClaseC c = new ClaseC();
        assertEquals(c.m1(),9,0.1);
    }

    @Test
    public void testm2() throws Exception {
        ClaseC c = new ClaseC();
        assertEquals(c.m2(),3);
        assertEquals(c.m3(),3);
        assertEquals(c.m4(),20);
        assertEquals(c.m6(),3);
        assertEquals(c.m7(),20);
    }
}
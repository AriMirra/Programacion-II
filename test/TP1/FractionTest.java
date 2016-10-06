package TP1;

import TP1.ejercicio5.Fraction;
import junit.framework.TestCase;

/**
 * Created by arimi on 13/08/2016.
 */
public class FractionTest extends TestCase {
    public void testAdd() throws Exception {
        Fraction test = new Fraction(1,2);
        Fraction test2 = new Fraction(1,4);
        Fraction test3 = new Fraction(3,4);

        assertEquals(true,test3.equals(test.add(test2)));
    }

    public void testSub() throws Exception {
        Fraction test = new Fraction(1,2);
        Fraction test2 = new Fraction(1,4);
        Fraction test3 = new Fraction(1,4);
        assertEquals(true, test3.equals(test.sub(test2)));
    }

    public void testMul() throws Exception {
        Fraction test = new Fraction(1,2);
        Fraction test2 = new Fraction(1,4);
        Fraction test3 = new Fraction(1,8);
        assertEquals(true,test3.equals(test.mul(test2)));
    }

    public void testDiv() throws Exception {
        Fraction test = new Fraction(1,2);
        Fraction test2 = new Fraction(1,4);
        Fraction test3 = new Fraction(4,2);
        assertEquals(true,test3.equals(test.div(test2)));
    }

    public void testAsFloat() throws Exception {
        Fraction test = new Fraction(1,2);
        assertEquals(0.5, test.asFloat(),0.1);
    }

    public void testEquals() throws Exception {
        Fraction test = new Fraction(1,2);
        Fraction test2 = new Fraction(1,2);
        assertEquals(true, test.equals(test2));
    }

}
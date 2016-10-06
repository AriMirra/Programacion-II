package TP1;

import TP1.ejercicio6.Polinomio;
import junit.framework.TestCase;

/**
 * Created by arimi on 15/08/2016.
 */
public class PolinomioTest extends TestCase {
    public void testSetCoef() throws Exception {
        Polinomio p = new Polinomio(2);
        p.setCoef(0,8);
        p.setCoef(1,16);
        p.setCoef(2,8);

        assertEquals(32, p.evaluar(1));
    }

    public void testEvaluar() throws Exception {
        Polinomio p = new Polinomio(2);
        p.setCoef(0,8);
        p.setCoef(1,16);
        p.setCoef(2,8);

        assertEquals(72, p.evaluar(2));
    }

    public void testDerivar() throws Exception {
        Polinomio p = new Polinomio(2);
        p.setCoef(0,8);
        p.setCoef(1,16);
        p.setCoef(2,8);
        Polinomio p2 = p.derivar();

        assertEquals(32, p2.evaluar(1));

    }

}
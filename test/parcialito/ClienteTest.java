package parcialito;

import junit.framework.TestCase;

/**
 * Created by arimi on 16-Sep-16.
 */
public class ClienteTest extends TestCase {
    public void testBuy() throws Exception {
        PlazoFijo A = new PlazoFijo(20);
        PlazoFijo B = new PlazoFijo(15);
        PlazoFijo C = new PlazoFijo(30);

        Portfolio cartera = new Portfolio();

        Client cliente = new Client(100000,cartera);

        cliente.invest(A,50000);
        assertEquals(50000,cliente.getBalance(),0.1);
        assertEquals(50000,cartera.money(),0.1);


    }

}
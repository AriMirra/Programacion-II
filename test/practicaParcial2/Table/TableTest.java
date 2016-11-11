package practicaParcial2.Table;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by arimi on 10-Nov-16.
 */
public class TableTest {
    Table table = new Table();
    Integer one = 1;
    @Test
    public void add() throws Exception {
        table.add("a","b",one);

        assertEquals(1,table.size(),0.1);
    }

    @Test
    public void get() throws Exception {
        table.add("a","b",one);
        System.out.println(table.get("a","b"));
    }

    @Test
    public void size() throws Exception {
        table.add("a","b",one);
        assertEquals(1,table.size(),0.1);
    }

}
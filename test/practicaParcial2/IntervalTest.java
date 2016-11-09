package practicaParcial2;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by arimi on 08-Nov-16.
 */
public class IntervalTest {
    @Test
    public void iterator() throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer i = 0; i<10; i++){
            numbers.add(i);
        }

        Interval interval = new Interval(numbers);

        for (Integer n: interval){
            System.out.println(n);
        }

    }

}
package practicaParcial2;

import org.junit.Test;
import practicaParcial2.IteratorComparator.NumbersComparator;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by arimi on 08-Nov-16.
 */
public class NumbersComparatorTest {
    @Test
    public void compare() throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (Integer i = 0; i<10; i++){
            numbers.add(random.nextInt(10));
        }
        for (Integer n : numbers){
            System.out.println(n);
        }

        System.out.println("ahora seee neneeee");
        numbers.sort(new NumbersComparator());

        for (Integer n : numbers){
            System.out.println(n);
        }

    }

}
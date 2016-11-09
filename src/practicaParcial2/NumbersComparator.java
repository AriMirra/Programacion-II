package practicaParcial2;

import java.util.Comparator;

/**
 * Created by arimi on 08-Nov-16.
 */
public class NumbersComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}

package practicaParcial2.IteratorComparator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by arimi on 08-Nov-16.
 */
public class Interval implements Iterable<Integer>{
    private ArrayList<Integer> numbers;

    public Interval(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index != numbers.size();
            }

            @Override
            public Integer next() {
                if (hasNext()) return numbers.get(index++);
                throw new IndexOutOfBoundsException("no hay mas giil");
            }

            @Override
            public void remove(){
                if (hasNext()) numbers.remove(index++);
                throw new IndexOutOfBoundsException("no ta ma, c'est fini");
            }
        };
    }
}
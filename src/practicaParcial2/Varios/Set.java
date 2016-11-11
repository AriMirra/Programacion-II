package practicaParcial2.Varios;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by arimi on 10-Nov-16.
 */
public class Set<T> implements Iterable<T> {
    private HashMap<Integer,T> set = new HashMap<Integer, T>();
    Integer i = 0;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return i != set.size();
            }

            @Override
            public T next() {
                return set.get(i++);
            }
        };

    }

    public void add (T t){
        if(set.containsValue(t)) throw new AlreadyPutException();
        set.put(i++,t);
    }

}

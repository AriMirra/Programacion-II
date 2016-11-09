package practicaParcial2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by arimi on 09-Nov-16.
 */
public class StackList<T extends Comparable> implements Iterable<T>,Stack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Integer index = 0;
            @Override
            public boolean hasNext() {
                return index != stack.size();
            }

            @Override
            public T next() {
                if (hasNext()) return stack.get(index++);
                throw new NullPointerException("no hay siguiente");
            }
        };

    }


    @Override
    public void push(T unT) {
        stack.add(unT);
    }

    @Override
    public T pop() {
        return stack.remove(stack.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void sort(Comparator<T> comparator){
        stack.sort(comparator);
    }

    public void print(){
        for (T n: stack){
            System.out.println(n);
        }
    }
}

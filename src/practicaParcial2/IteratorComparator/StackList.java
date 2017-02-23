package practicaParcial2.IteratorComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by arimi on 09-Nov-16.
 */
public class StackList<T extends Comparable> implements Iterable<T>,Stack<T> {

    private ArrayList<T> stack = new ArrayList<>();


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

    public void sort(){
        boolean sorted = false;

        for (int i = 0; i<stack.size(); i++){
            if ((Integer)stack.get(i) > (Integer)stack.get(i+1)){
                //falta implementar el BubbleSort
            }
        }
    }

    public void print(){
        for (T n: stack){
            System.out.println(n);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

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
}

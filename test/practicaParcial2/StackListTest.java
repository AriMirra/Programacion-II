package practicaParcial2;

import org.junit.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * Created by arimi on 09-Nov-16.
 */
public class StackListTest {
    @Test
    public void iterator() throws Exception {
        StackList<Integer> stack = new StackList();
        stack.push(5);
        stack.push(6);
        stack.push(2);
        stack.push(1);
        stack.push(7);

        stack.print();

        Comparator integerComparator = new NumbersComparator();
        stack.sort(integerComparator);

        System.out.println();
        System.out.println();

        stack.print();

    }

    @Test
    public void push() throws Exception {

    }

    @Test
    public void pop() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {

    }

}
package practicaFinal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by arimi on 19-Dec-16.
 */
public class LambdaPractice {
    public static void main (String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        numbers.forEach(value -> System.out.println(value));
        System.out.println();
        numbers.forEach(System.out::println);
    }

}

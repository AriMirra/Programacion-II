package practicaParcial2.Table;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by arimi on 10-Nov-16.
 */
public class Table {
    private HashMap<String,HashMap<String, Object>> mapA = new HashMap<>();
    private HashMap<String, Object> mapB = new HashMap<>();

    public void add (String KeyDimensionA, String KeyDimensionB, Object object){
        mapA.put(KeyDimensionA,mapB);
        mapB.put(KeyDimensionB,object);
    }

    public Object get(String KeyDimensionA, String KeyDimensionB){
        HashMap<String, Object> keyB = mapA.get(KeyDimensionA);
        return keyB.get(KeyDimensionB);
    }

    public void remove (Object object){
        if(mapB.containsValue(object)) mapB.remove(object);
    }

    public int size(){
        return mapB.size();
    }
}

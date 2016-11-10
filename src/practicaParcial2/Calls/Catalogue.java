package practicaParcial2.Calls;

import java.util.HashMap;

/**
 * Created by arimi on 09-Nov-16.
 */
public class Catalogue {

    private HashMap<CallType,Double> catalogue = new HashMap<>();

    public void add (CallType callType, double value){
        catalogue.put(callType,value);
    }

    public HashMap<CallType, Double> getCatalogue() {
        return catalogue;
    }
}

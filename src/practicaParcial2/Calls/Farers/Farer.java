package practicaParcial2.Calls.Farers;

import practicaParcial2.Calls.Call;
import practicaParcial2.Calls.CallType;
import practicaParcial2.Calls.Catalogue;

/**
 * Created by arimi on 09-Nov-16.
 */
public abstract class Farer {
    private Catalogue catalogue;
    private CallType callType;

    public Farer(Catalogue catalogue, CallType callType) {
        this.catalogue = catalogue;
        this.callType = callType;
    }

    public Double Fare(Call call){
        return call.getDuration() * catalogue.getCatalogue().get(callType);
    }
}

package TP4.tarjetas;

/**
 * Created by arimi on 01/09/2016.
 */
public class SubeJubilado extends Sube {

    public SubeJubilado(){
       super();
    }

    public void discountBalance(double amount){
        super.discountBalance(amount*0.8);
    }
}

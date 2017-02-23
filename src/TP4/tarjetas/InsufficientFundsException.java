package TP4.tarjetas;

/**
 * Created by arimi on 23-Feb-17.
 */
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String aMessage){
        super(aMessage);
    }
}

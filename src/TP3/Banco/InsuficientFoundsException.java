package TP3.Banco;

/**
 * Created by arimi on 22-Feb-17.
 */
public class InsuficientFoundsException extends RuntimeException {
    public InsuficientFoundsException(String aMessage){
        super(aMessage);
    }
}

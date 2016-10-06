package parcialito;

/**
 * Created by arimi on 16-Sep-16.
 */
public class OutOfMoneyException extends RuntimeException{
    public OutOfMoneyException(String message) {
        //String message = "fondos insuficientes";
        super(message);
    }
}

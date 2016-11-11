package practicaParcial2.Varios;

/**
 * Created by arimi on 10-Nov-16.
 */
public class AlreadyPutException extends RuntimeException {
    public AlreadyPutException() {
        super("este elemnto ya esta adentro del set");
    }
}

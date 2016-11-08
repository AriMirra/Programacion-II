package parcial1;

/**
 * Created by arimi on 08-Nov-16.
 */
public class AccesDeniedException extends RuntimeException {
    private String message;
    //private String message = "acceso denegado";


    public AccesDeniedException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}

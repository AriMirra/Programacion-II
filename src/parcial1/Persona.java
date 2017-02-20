package parcial1;

/**
 * Created by arimi on 08-Nov-16.
 */
public abstract class Persona {
    private Tarjeta tarjeta;

    public Persona(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {return tarjeta;}

}

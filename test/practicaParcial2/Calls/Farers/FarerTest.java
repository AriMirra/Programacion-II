package practicaParcial2.Calls.Farers;

import org.junit.Test;
import practicaParcial2.Calls.Call;
import practicaParcial2.Calls.CallType;
import practicaParcial2.Calls.Catalogue;
import practicaParcial2.Calls.PhoneNumber;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * Created by arimi on 10-Nov-16.
 */
public class FarerTest {
    @Test
    public void fare() throws Exception {
        PhoneNumber number1 = new PhoneNumber(54,011,69751726);
        PhoneNumber number2 = new PhoneNumber(54,011,21636923);

        Call llamada = new Call( LocalDateTime.now(),number1,number1,60);

        Catalogue catalogo = new Catalogue();

        catalogo.add(CallType.INTERNATIONAL,1);
        catalogo.add(CallType.NATIONAL,0.5);
        catalogo.add(CallType.LOCAL,0.1);

        Farer tarifador = new Farer(catalogo,llamada);

        System.out.println(tarifador.Fare(llamada));
    }

}
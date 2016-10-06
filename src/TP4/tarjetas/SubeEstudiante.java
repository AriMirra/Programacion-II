package TP4.tarjetas;

/**
 * Created by arimi on 02/09/2016.
 */
public class SubeEstudiante extends Sube {
    private int viajes;

    public SubeEstudiante(){
        super();
        viajes = 0;
    }

    public void discountBalance(double amount){
        if (viajes< 2 && getBalance() + getDescubierto() > amount){
            super.discountBalance(amount*0.2);
        }
        else super.discountBalance(amount);
    }
}

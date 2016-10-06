package TP2.ejercicio3;

/**
 * Created by arimi on 19/08/2016.
 */
public class Cashier {
    private double cost = 0;
    public Invoice checkout(DrinkCart cart){
        for (int i = 0; i< cart.getSpace(); i++){
            cost += cart.drinks(i).getPrice();
        }
        Invoice ticket = new Invoice(cart,cost);
        return ticket;
    }

}

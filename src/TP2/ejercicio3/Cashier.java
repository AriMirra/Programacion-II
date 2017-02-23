package TP2.ejercicio3;

import java.util.ArrayList;

/**
 * Created by arimi on 19/08/2016.
 */
public class Cashier {
    private double cost = 0;
    public Invoice checkout(DrinkCart cart){
        ArrayList<Drink> drinks = cart.getDrinks();
        for (Drink d: drinks){
            cost += d.getPrice();
        }
        Invoice ticket = new Invoice(cart,cost);
        return ticket;
    }

}

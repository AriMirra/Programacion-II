package TP2.ejercicio3;

import java.util.ArrayList;

/**
 * Created by arimi on 26/08/2016.
 */
public class Invoice{
    private ArrayList<Drink> drinkList;
    private double totalCost;

    public Invoice(DrinkCart cart, double cost){
        drinkList = cart.getDrinks();
        totalCost = cost;
    }
}

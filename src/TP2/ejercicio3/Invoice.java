package TP2.ejercicio3;

/**
 * Created by arimi on 26/08/2016.
 */
public class Invoice{
    private Drink[] drinkList;
    private double totalCost;

    public Invoice(DrinkCart cart, double cost){
        for (int i = 0; i< cart.getSpace(); i++){
            drinkList = new Drink[cart.getSpace()];
            drinkList[i] = cart.drinks(i);
            totalCost = cost;
        }

    }
}

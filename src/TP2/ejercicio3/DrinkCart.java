package TP2.ejercicio3;

import java.util.ArrayList;

/**
 * Created by arimi on 19/08/2016.
 */
public class DrinkCart {
    /**
     * Implemente la clase DrinkCart que va conteniendo las diferentes bebidas de un carrito de compras de un cliente.
     * Implemente la clase Cashier que sabe calcular el costo del carrito de compras y emitir una factura.
     * Implemente la clase Invoice que será la factura resultado del
     checkout del Cashier. Invoice conoce los items comprados, su costo y el total a abonar.
     */

    private ArrayList<Drink> drinks;
    public DrinkCart(){
        drinks = new ArrayList<>();
    }
    public void addDrink(Drink bebida){
        drinks.add(bebida);
    }
    public int getSpace(){return drinks.size();}

    public ArrayList<Drink> getDrinks(){return drinks;}
}

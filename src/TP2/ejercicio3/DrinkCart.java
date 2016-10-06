package TP2.ejercicio3;

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

    private Drink[] drinkArray;
    private int space = 0;
    public DrinkCart(int amount){
        drinkArray = new Drink[amount];
    }

    public boolean addDrink(Drink bebida){
        if (space != drinkArray.length){
            for (int i = 0; i< drinkArray.length; i++){
                if(drinkArray[i]== null) {
                    drinkArray[i] = bebida;
                    space++;
                    return true;
                }
            }
        }
        return false;
    }
    public int getSpace(){return space;}

    public Drink drinks(int place){
        return drinkArray[place];
    }



}

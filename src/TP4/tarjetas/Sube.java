package TP4.tarjetas;

/**
 * Created by arimi on 01/09/2016.
 */
public class Sube {
    private double balance;
    private double descubierto = 10;

    public Sube(){
        balance = 0;
    }

    public void discountBalance(double amount){
        if (balance + descubierto > amount) balance -= amount;
    }
    public void addBalance(double amount){
        balance += amount;

    }

    public void changeDescubierto(int n){
        descubierto = n;
    }

    public double getBalance(){return balance;}
    public double getDescubierto(){return descubierto;}
}

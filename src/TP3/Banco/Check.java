package TP3.Banco;

/**
 * Created by arimi on 30/08/2016.
 */
public class Check {
    private boolean used = false;
    private double amount;
    private BankAccount owner;

    public Check(double amount,BankAccount account){
        if (account.getBalance()>= amount){
            this.amount = amount;
            this.owner = account;
        }


    }

    public void deposit(BankAccount account){
        if (used == false){
            owner.withdraw(amount);
            account.deposit(amount);
            used = true;
        }
        else System.out.println("this check is already used");
    }
}

package TP3.Banco;

/**
 * Created by arimi on 28/08/2016.
 */
public class CheckingAccount extends BankAccount{
    private double descubierto;
    private String name;
    private double balance;

    public CheckingAccount(String name, double disponible){
        this.name = name;
        this.descubierto = disponible;
        balance = 0 + descubierto;
    }

    public CheckingAccount (String name){
        this.name = name;
        this.descubierto = 0;
    }

    public void deposit(double amount){
        if (amount>0) {
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount>0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName(){return name;}

    public Check issueCheck(double amount){
        Check cheque = new Check(amount,this);
        return cheque;
    }

    public void depositCheck(Check cheque){
        cheque.deposit(this);
    }

}

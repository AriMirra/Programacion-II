package TP3.Banco;

/**
 * Created by arimi on 30/08/2016.
 */
public class SpecialAccount extends BankAccount {
    private String name;
    private double balance;
    private int points = 0;

    public SpecialAccount(String name){
        this.name = name;
        balance = 0;
    }


    public void deposit(double amount){
        if (amount>0) {
            balance += amount;
            points += 5;
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

    public int getPoints() {
        return points;
    }
}

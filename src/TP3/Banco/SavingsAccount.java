package TP3.Banco;

/**
 * Created by arimi on 28/08/2016.
 */
public class SavingsAccount extends BankAccount {
    private String name;
    private double balance;
    private int freeTransactions = 10;

    public SavingsAccount(String name){
        balance = 0;
        this.name = name;
    }


    public void withdraw(double amount){
        if (amount>0 && balance >= amount) {
            balance -= amount;
            freeTransactions--;
        }
    }


    public void deposit(double amount){
        if (amount>0) {
            balance += amount;
            freeTransactions--;
        }
    }


    public double getBalance(){
        return balance;
    }

    public String getName(){return name;}

    public Check issueCheck(double amount){
        Check cheque = new Check(amount,this);
        return cheque;
    }

    public void depositCheck(Check cheque){
        cheque.deposit(this);
    }

    public int getFreeTransactions() {
        return freeTransactions;
    }
}

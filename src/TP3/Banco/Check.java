package TP3.Banco;

/**
 * Created by arimi on 30/08/2016.
 */
public class Check {
    private boolean used = false;
    private double amount;
    private BankAccount owner;

    public Check(double amount,BankAccount account){
            this.amount = amount;
            this.owner = account;
    }

    public void deposit(BankAccount account){
        if (used == false && owner.getBalance()>= amount){
            owner.withdraw(amount);
            account.deposit(amount);
            used = true;
        }
        else {
            throw new InsuficientFoundsException("no hay saldo suficiente en la cuenta del dueño del cheque");
        }
    }
}

package TP3.Banco;
/**
 * Created by arimi on 05/08/2016.
 */
public abstract class BankAccount {

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract double getBalance();

    public abstract String getName();

    public abstract Check issueCheck(double amount);

    public abstract void depositCheck(Check cheque);
}

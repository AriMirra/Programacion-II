package TP3.Banco;

import java.util.ArrayList;

/**
 * Created by arimi on 18/08/2016.
 */
public class Bank {
    private ArrayList<BankAccount> accounts;
    private String name;

    public Bank(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void transfer(double money, BankAccount account1, BankAccount account2){
        if (account1.getBalance()>= money){
            account1.withdraw(money);
            account2.deposit(money);
        }
        else throw new InsuficientFoundsException("no tiene saldo suficiente");
    }

    public void addBankAccount (BankAccount account){
        accounts.add(account);
    }
}
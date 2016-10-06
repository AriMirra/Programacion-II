package TP3.Banco;

/**
 * Created by arimi on 18/08/2016.
 */
public class Bank {
    private BankAccount[] accounts;
    private String name;

    public Bank(String name, int accounts){
        this.accounts = new BankAccount[accounts];
        this.name = name;
    }

    public boolean transfer(double money, BankAccount account1, BankAccount account2){
        for (int i = 0; i< accounts.length; i++){
            if (account1.getName().equals(accounts[i].getName())) {
                for (int j = 0; j< accounts.length; j++){
                    if (account2.getName().equals(accounts[j].getName())){
                        if (money <= account1.getBalance()){
                            account1.withdraw(money);
                            account2.deposit(money);
                            return true;
                        }
                    }
                }
            }
        }
        System.out.println("insufficient founds");
        return false;
    }

    public boolean addBankAccount (BankAccount account){
        for (int i = 0; i< accounts.length; i++){
            if (accounts[i] == null){
                accounts[i] = account;
                return true;
            }
        }
        return false;
    }
}
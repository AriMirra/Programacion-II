package TP3.Banco;

import junit.framework.TestCase;

/**
 * Created by arimi on 30/08/2016.
 */
public class BankTest extends TestCase {
    CheckingAccount account1 = new CheckingAccount("Ari",100);
    SavingsAccount account2 = new SavingsAccount("wewey");

    public void testBanco() throws Exception {
        Bank holis = new Bank("holis",10);
        holis.addBankAccount(account1);
        holis.addBankAccount(account2);
        account1.deposit(100);
        Check cheque = account1.issueCheck(100);
        account2.depositCheck(cheque);
        assertEquals(100,account2.getBalance(), 0.1);
        assertEquals(9,account2.getFreeTransactions());
        holis.transfer(100,account1,account2);
        assertEquals(0,account1.getBalance(),0.1);

    }

}
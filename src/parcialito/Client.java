package parcialito;

/**
 * Created by arimi on 16-Sep-16.
 */
public class Client {
    private double balance;
    private Portfolio cartera;

    public Client(double balance, Portfolio cartera){
        this.balance = balance;
        this.cartera = cartera;
    }

    public double getBalance() {
        return balance;
    }

    public void invest(ibuyable buyable,double amount){
        try{
            Investment inversion = new Investment(buyable,amount);
            cartera.addInvestment(inversion);
            balance -= amount;
        }
        catch (OutOfMoneyException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}

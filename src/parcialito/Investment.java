package parcialito;

/**
 * Created by arimi on 16-Sep-16.
 */
public class Investment {
    private ibuyable buyable;
    private double amount;

    public Investment(ibuyable buyable, double amount){
        this.amount = amount;
        this.buyable = buyable;
    }

    public ibuyable getBuyable() {
        return buyable;
    }

    public double getAmount() {
        return amount;
    }

    public double profitEveryYear(){
        return buyable.getPercentage()* amount;
    }
}

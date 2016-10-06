package parcialito;

/**
 * Created by arimi on 16-Sep-16.
 */
public class Bono implements ibuyable{
    private double percentage;
    private double price;


    public Bono(double price, double percentage){
        this.price = price;
        this.percentage = percentage;
    }


    public double getPercentage() {
        return percentage;
    }

    public double getPrice() {
        return price;
    }



}

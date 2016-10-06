package parcialito;

/**
 * Created by arimi on 16-Sep-16.
 */
public class PlazoFijo implements ibuyable {
    private double percentage;

    public PlazoFijo(double percentage){
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }


}

package parcialito;

import java.util.ArrayList;

/**
 */
public class Portfolio {
    private ArrayList<Investment> inversiones;

    public Portfolio(){
        inversiones = new ArrayList<Investment>();
    }

    public void addInvestment(Investment inversion){
        inversiones.add(inversion);
    }

    public double money(){
        double money = 0;
        for (int i = 0; i <inversiones.size(); i++){
            money += inversiones.get(i).getAmount();
        }
        return money;
    }

    public double futureMoney(int days){
        double money = this.money();
        for (int i = 0; i <inversiones.size(); i++){
            money += inversiones.get(i).profitEveryYear()*(days/365);
        }
        return money;
    }



}

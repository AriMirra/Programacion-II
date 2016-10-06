package TP3.ejercicio3;

/**
 * Created by arimi on 25/08/2016.
 */
public class Ellipse extends Figure {
    private double minorAxis;
    private double majorAxis;

    public Ellipse(double minorAxis, double majorAxis){
        this.minorAxis = minorAxis;
        this.majorAxis = majorAxis;
    }
    @Override
    public double perimeter(){
        return 2*Math.PI*(Math.sqrt((minorAxis*minorAxis + majorAxis * majorAxis)/2));
    }

    @Override
    public double area (){
        return Math.PI*minorAxis*majorAxis;
    }


}

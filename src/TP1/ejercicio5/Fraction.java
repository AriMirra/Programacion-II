package TP1.ejercicio5;

/**
 * Created by arimi on 13/08/2016.
 */
public class Fraction {
    private int dividendo;
    private int divisor;

    public Fraction(int dividendo, int divisor){
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    private int mcm (int a, int b){
        if (b==0) return a;
        return mcm(b, a%b);
    }

    private Fraction simplify(Fraction f){
        int mcm = f.mcm(f.dividendo,f.divisor);
        f.dividendo = f.dividendo / mcm;
        f.divisor = f.divisor / mcm;
        return f;
    }

    public Fraction add(Fraction f){
        int abajo = this.divisor * f.divisor;
        int arriba = abajo / this.divisor * this.dividendo + abajo / f.divisor * f.dividendo;
        Fraction result = new Fraction(arriba,abajo);
        return simplify(result);

    }

    public Fraction sub(Fraction f){
        int abajo = this.divisor * f.divisor;
        int arriba = abajo / this.divisor * this.dividendo - abajo / f.divisor * f.dividendo;
        Fraction result = new Fraction(arriba,abajo);
        return simplify(result);

    }

    public Fraction mul(Fraction f){
        int arriba = dividendo * f.dividendo;
        int abajo = divisor * f.divisor;
        Fraction result = new Fraction(arriba,abajo);
        return result;

    }

    public Fraction div(Fraction f){
        int arriba = dividendo * f.divisor;
        int abajo = divisor * f.dividendo;
        Fraction result = new Fraction(arriba,abajo);
        return result;

    }

    public float asFloat(){return (float)dividendo / (float)divisor;}

    public boolean equals(Fraction f){
        return dividendo == f.dividendo && divisor == f.divisor;
    }
}

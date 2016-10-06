package TP1.ejercicio6;

/**
 * Created by arimi on 12/08/2016.
 */
public class Polinomio {
    private int grado;
    private int[] coeficientes;

    public Polinomio (int grade){
        grado = grade;
        coeficientes = new int[grade+1];
    }

    public void setCoef(int grado, int coeficiente){
        coeficientes[grado] = coeficiente;

    }

    public int evaluar (int valor){
        int result = 0;
        for (int i = 0; i< coeficientes.length; i++){
            result += coeficientes[i]* Math.pow(valor,i);
        }
        return result;
    }

    public Polinomio derivar(){
        //creo el polinomio nuevo
        Polinomio p = new Polinomio(grado-1);

        //derivo
        for (int i = 0; i<p.coeficientes.length; i++){
            p.coeficientes[i] = coeficientes[i+1]*(i+1);
        }
        return p;
    }
}
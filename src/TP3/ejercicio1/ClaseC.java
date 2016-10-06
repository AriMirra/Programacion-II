package TP3.ejercicio1;

/**
 * Created by arimi on 19/08/2016.
 */
public class ClaseC extends ClaseB {
    @Override
    public int m1(){return super.m1()+1;}

    @Override
    public int m2(){return this.m6();}

    public int m6(){return 3;}
}
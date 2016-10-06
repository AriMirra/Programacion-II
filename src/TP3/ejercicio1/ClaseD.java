package TP3.ejercicio1;

/**
 * Created by arimi on 19/08/2016.
 */
public class ClaseD extends ClaseB {
    public ClaseD() {}
    @Override
    public int m1(){return super.m3();}

    @Override
    public int m3(){return 2;}

    public int m5(){return this.m4();}
}

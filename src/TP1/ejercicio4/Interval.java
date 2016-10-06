package TP1.ejercicio4;

/**
 * Created by arimi on 13/08/2016.
 */
public class Interval {
    private int[] interval;
    private int size;

    public Interval (int size, int intervalo){
        this.size = size;
        int n = 0;
        interval = new int[size];
        for(int i = 0; i < size; i++){
            interval[i] = n + intervalo;
            n = n + intervalo;
        }
    }

    public int first(){
        return interval[0];
    }

    public int last(){
        return interval[size-1];
    }

    public int at(int index){
        return interval[index -1];
    }

    public int size() {
        return size;
    }
}

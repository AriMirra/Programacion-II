package TP2.ejercicio5;

/**
 * Created by arimi on 20/08/2016.
 */
public class Equals {
    public static void main(String[] args) {
        String str1 = "Hola Mundo!";
        String str2 = "Hola Mundo!";
        String str3 = "Hola ";
        String str4 = "Mundo!";
        String str5 = str3 + str4;
        int num1 = 1;
        Integer num1_2 = 1;
        Integer num200 = 200;
        Integer num200_1 = 200;
        System.out.println(str1 == str2);
        System.out.println(str1 == str5);
        System.out.println(str1.equals(str5));

        System.out.println(num1_2.equals(num1));
        System.out.println(num200 == num200_1);
        System.out.println(num200.equals(num200_1));
    }
}

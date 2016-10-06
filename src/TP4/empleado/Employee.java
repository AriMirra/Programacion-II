package TP4.empleado;

/**
 * Created by arimi on 01/09/2016.
 */
public class Employee {
    private double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void changeSalary(double amount){
        salary = amount;
    }

}

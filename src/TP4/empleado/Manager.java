package TP4.empleado;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arimi on 01/09/2016.
 */
public class Manager extends Employee {
    private List<Employee> employees;

    public Manager(double salary) {
        super(salary);
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee empleado){
        employees.add(empleado);
        changeSalary(empleado.getSalary()*0.01 + getSalary());
    }
}

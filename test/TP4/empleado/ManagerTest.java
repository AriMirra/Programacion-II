package TP4.empleado;

import junit.framework.TestCase;

/**
 * Created by arimi on 9/4/16.
 */
public class ManagerTest extends TestCase {
    public void testAddEmployee() throws Exception {
        Manager ariel = new Manager(10000);
        Employee fede = new Employee(5000);
        ariel.addEmployee(fede);
        System.out.println(fede.getSalary());
        System.out.println(ariel.getSalary());
        assertEquals(10050,ariel.getSalary(), 0.1);


    }

}
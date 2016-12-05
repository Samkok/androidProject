/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Samkok;

public class Employee extends Person{
    private double salary;
    public Employee() {
        super();
        salary = 500;
    }
    public Employee(String name, String phone, double salary) {
        super(name, phone);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public String toString() {
        return super.toString() + "\nSalary: " + salary;
    }
}

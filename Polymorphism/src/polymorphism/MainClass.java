/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import Samkok.Employee;
import Samkok.Person;
import Samkok.Staff;
import Samkok.Student;

public class MainClass {

    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        Student student = new Student();
        Staff staff = new Staff();
        
        System.out.println(person.toString());
        System.out.println(employee.toString());
        
        Person lst[] = new Person[4];
        lst[0] = person;
        lst[1] = employee;
        lst[2] = student;
        lst[3] = staff;
        
        for (Person person2 : lst) {
            System.out.println(person2.toString());
            
        }
        
    }
    
}

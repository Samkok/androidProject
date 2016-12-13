/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import com.samkok.Student;

public class MainClass {

    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println(obj.toString());
        Employee objEmp = new Employee(2, "Samkok Heng", "011323270");
        System.out.println(objEmp.toString());
        objEmp.setID(3);
        objEmp.setName("Samkok");
        System.out.println(objEmp.toString());
        
        Student objStu = new Student();
        objStu.setGrade("2nd year student");
        System.out.println(objStu.toString());
    }
    
}

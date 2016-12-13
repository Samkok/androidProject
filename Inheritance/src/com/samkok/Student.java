/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

import inheritance.Employee;


public class Student extends Employee {
    private String grade;
    public Student(){
        super();
    }
    public Student(int id, String name, String phone, String grade){
        super(id, name, phone);
        this.setGrade(grade);
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
    public String toString() {
        return super.toString() + " " + getGrade();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Samkok;

/**
 *
 * @author MacBook
 */
public class Student extends Person {
    
    private String university;
    public Student(){
        setUniversity("setec");
    }
    public Student(String name, String phone, String university){
        super(name, phone);
        this.setUniversity(university);
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university){
        this.university = university;
    }
    public String toString() {
        return super.toString() + " University: " + this.getUniversity();
    }
    
}

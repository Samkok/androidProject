/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Samkok;

public class Staff extends Employee{
    private String position;
    public Staff(){
        position = "java";
    }
    public Staff(String name, String phone, double salary, String position) {
        super(name, phone, salary);
        setPosition(position);
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
    public String toString(){
        return super.toString() + " Position: " + this.getPosition();
    }
}

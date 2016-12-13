/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Samkok;


public class Person {
    
    public String name;
    private String phone;
    public Person() {
        this.name = "Samkok";
        this.phone = "011323270";
    }
    public Person(String name, String phone){
        setName(name);
        setPhone(phone);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName(String name) {
        return this.name;
    }
    public String getPhone(String phone) {
        return this.phone;
    }
    public String toString() {
        return "Name: " + name + " Phone: " + phone;
    }
    
}

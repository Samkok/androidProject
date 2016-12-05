/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

public abstract class Person {
    private String name;
    private String address;
    public Person(){
        this.name = "Samkok";
        this.address = "Phnom Penh";
    }
    public String getName(){
        return name;
    }
    
    public abstract void setName(String name);
    public abstract String getAddress();
    public void setAddress(String addr) {
        this.address = addr;
    }
    
}

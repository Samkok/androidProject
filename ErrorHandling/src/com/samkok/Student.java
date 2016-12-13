
package com.samkok;

public class Student {
    private String name;
    private String gender;
    
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public void setGender(String gender) throws GenderException {
        if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") == false) {
            throw new GenderException();
        }
        this.gender = gender;
    }
    
    public Student(){
        
    }
    
    public String toString(){
        return "Name: " + getName() + "\nGender: " + getGender();
    }
}

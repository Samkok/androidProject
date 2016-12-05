/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleproject;

public class SimpleProject {
    private int id;
    private String name;
    private String gender;
    
    public SimpleProject(){
        id = 1;
        name = "Samkok Heng";
        gender = "Male";
    }
    
    public SimpleProject(int id, String name, String gender) {
        this.id = id;
        setName(name);
        setGender(gender);
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public static void main(String[] args) {
        
        SimpleProject object = new SimpleProject();
        object.setName("Samkok");
        System.out.println(object.getName());
        
        SimpleProject object1;
        object1 = new SimpleProject(2, "Heng Samkok","Male");
        System.out.println(object1.id);
        System.out.println(object1.name);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

public class Person {
    private int id;
    private String name;
    
    public Person() {
        setID(1);
        setName("Samkok Heng");
    } 
    public Person(int id, String name) {
        setID(id);
        setName(name);
    }
    public void setID(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return id + "  " + name;
    }
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}

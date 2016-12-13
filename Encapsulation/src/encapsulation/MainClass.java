/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;


public class MainClass {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
        person.setName("Heng kok");
        System.out.println(person.toString());
        
    }
    
}

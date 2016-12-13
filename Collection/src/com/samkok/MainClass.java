/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

import java.util.Vector;

public class MainClass {

    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Cat");
        vector.add("Cow");
        vector.addElement("Duck");
        vector.add(3, "Bird");
        vector.set(0, "snake");
        
        for (int i=0; i < vector.size() ; i++) {
            System.out.println(vector.elementAt(i));
        }
        
        System.out.println(vector.capacity());
        System.out.println(vector.elementAt(1));
        System.out.println(vector.indexOf("Duck"));
        
        vector.insertElementAt("Chicken", 0);
        
        System.out.println(vector.lastIndexOf("Cow"));
    }
    
}

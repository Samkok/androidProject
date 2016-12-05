/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

import java.util.Hashtable;

public class MainClass {
    
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        hashtable.put(0, "A");
        hashtable.put(1, "B");
        hashtable.put(2, "C");
        hashtable.put(3, "D");
        hashtable.remove(3);
        for (int i = 0; i < hashtable.size(); i++) {
            System.out.println(hashtable.get(i));
        }
        
    }
    
}

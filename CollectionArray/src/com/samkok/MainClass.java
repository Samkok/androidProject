/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Samkok");
        arrayList.add("Brotean");
        arrayList.add("MonyReach");
        arrayList.add("Sambo");
        
        for (String string: arrayList) {
            System.out.println(string.toString());
        }
    }
    
}

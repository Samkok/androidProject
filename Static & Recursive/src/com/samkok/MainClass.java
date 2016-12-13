/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

public class MainClass {

    public static String display(){
        return "Non static";
    }
    
    public static void main(String[] args) {
        System.out.print(display());
        Recursion recursion = new Recursion();
        
        
        System.out.println(Recursion.Factorial(10));
        System.out.println(Recursion.SumSeries(6));
    }
    
}

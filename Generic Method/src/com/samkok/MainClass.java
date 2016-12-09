/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

public class MainClass {

    static <T, V extends T> boolean isIn(T x, V[] y){
        for (int i=0; i<y.length; i++){
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        
        T max = x; // Assum x is initially the largest
        
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        
        return max;
            
    }
    
    public static void main(String[] args) {
        Integer num[] = {2,3,5,3,6,4,8};
        if (isIn(10, num)) {
            System.out.println("Number 2 is in num");
        } else {
            System.out.println("Number is not in num");
        }
        
        String str[] = {"one","two","three"};
        if (isIn("one", str)) {
            System.out.println("one is in str[]");
        } else {
            System.out.println("str is not in str[]");
        }
        
    }
    
}

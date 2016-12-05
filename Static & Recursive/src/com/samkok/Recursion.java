/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

public class Recursion {
    public Recursion(){
        
    }
    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }
    public static int SumSeries(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + SumSeries(n-1);
        }
    }
}

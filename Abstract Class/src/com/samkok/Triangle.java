/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

import java.util.Scanner;

public class Triangle extends Shape {

    protected double a;
    protected double b;
    protected double c;
    
    Scanner input = new Scanner(System.in);
    
    public Triangle(){
        setA(3.0);
        setB(4.0);
        setC(5.0);
    }
    
    public Triangle(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }
    private boolean isTriangle() {
        if (getA() + getB() < getC() || getA() + getC() < getB() || getC() + getB() < getA()) {
            return false;
        } else {
            return true;
        }
    }
    double getArea() {
        double p = 0.0;
        double q = 0.0;
        p = getParameter() / 2;
        q = Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
        return q;
    }

    double getParameter() {
        double p = 0.0;
        if (isTriangle())
            p = getA() + getB() + getC();
        return p;
    }
    
    public void inputValue(double a1, double b1, double c1){
        
        printText("Enter A : "); a1 = input.nextDouble();
        printText("Enter B : "); b1 = input.nextDouble();
        printText("Enter C : "); c1 = input.nextDouble();
        
        setA(a1);
        setB(b1);
        setC(c1);
        
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double getC() {
        return c;
    }
    
    public String toString(){
        String str = "";
        str = "Size A : " + getA() + "\nSize B : " + getB() + "\nSize C : " + getC()
                + "\nArea: " + getArea() + "\nParameter: " + getParameter();
        return str;
    }
    
    public void printText(String text) {
        System.out.print(text);
    }
}

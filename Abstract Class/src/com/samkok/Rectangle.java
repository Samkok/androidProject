/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;

import java.util.Scanner;

public class Rectangle extends Shape {

    protected double width;
    protected double height;
    
    Scanner input = new Scanner(System.in);
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void inputValue(double width1, double height1){
        printText("Enter Width : "); width1 = input.nextDouble();
        printText("Enter Height : "); height1 = input.nextDouble();
        
        setWidth(width1);
        setHeight(height1);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public Rectangle() {
        setWidth(4.0);
        setHeight(6.0);
    }
    
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
    
    double getArea() { 
        return getWidth() * getHeight();
    }
  
    double getParameter() {
        return (getWidth() + getHeight()) * 2;
    }
    
    public String toString(){
        String str = "";
        str = "Width: " + getWidth() + "\nHeight" + getHeight()
                + "\nArea: " + getArea() + "\nParameter: " + getParameter();
        return str;
    }
    
    public void printText(String text) {
        System.out.print(text);
    }
    
}

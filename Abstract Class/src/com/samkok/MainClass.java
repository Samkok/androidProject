/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samkok;
import java.util.Scanner;

public class MainClass {
    
    public static void main(String[] args) {
        
//        Triangle triangle = new Triangle();
//        Rectangle rectangle = new Rectangle();
//        
//        triangle.inputValue(triangle.a, triangle.b, triangle.c);
//        System.out.println("-------------------");
//        System.out.println(triangle.toString());
//        System.out.println("-------------------");
//        rectangle.inputValue(rectangle.width, rectangle.height);  
//        System.out.println("-------------------");
//        System.out.println(rectangle.toString());

        Person person = new Person() {
            @Override
            public void setName(String name) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getAddress() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    }
    
}

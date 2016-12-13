
package com.samkok;

public class MainClass {

    public static void main(String[] args) {
        
//        int a[] = {4,6,8,10,12,4};
//        int b[] = {2,2,0,5,6};
//        
//            for (int i = 0; i < a.length; i++) {
//                
//                try {
//                    System.out.println("Result: " + a[i] / b[i]);
//                } catch (Exception e) {
//                    System.out.println(e.toString());
//                }
//            }
//        
//        

        Student student = new Student();
        student.setName("Samkok Heng");
        try {
            student.setGender("Boy");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        
        System.out.println(student.toString());

    }
    
}

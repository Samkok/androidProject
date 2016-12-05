/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
/**
 *
 * @author MacBook
 */
public class JavaApplication1 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void displayArray(int arr[][], int row, int col) {
        for (int i=0 ; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }
    
    public static void inputArray(int arr[][], int row, int col) {
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++){
                System.out.print("Enter M[" + i + "][" + j + "] : ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int m1_row, m1_cols, m2_row, m2_cols;
        int m1[][], m2[][], m3[][] = null;
        System.out.println("Sum 2 Matrix");
        System.out.println("Enter matrix 1");
        System.out.print("row matrix 1: ");
        m1_row = scanner.nextInt();
        System.out.print("col matrix 1: ");
        m1_cols = scanner.nextInt();
        m1 = new int[m1_row][m1_cols];
        inputArray(m1 , m1_row, m1_cols);
        
        System.out.println("Enter matrix 2");
        System.out.print("row matrix 2: ");
        m2_row = scanner.nextInt();
        System.out.print("col matrix 2: ");
        m2_cols = scanner.nextInt();
        m2 = new int[m2_row][m2_cols];
        inputArray(m2, m2_row, m2_cols);
        
        if ((m1_row == m2_row) && (m1_cols == m2_cols)) {
            m3 = new int[m1_row][m1_cols];
            for (int i=0; i<m1_row; i++){
                for (int j=0 ; j<m1_cols; j++){
                    m3[i][j] = m2[i][j] + m1[i][j];
                }
            }
            
        }
        displayArray(m3, m1_row, m1_cols);
        
    }
    
}

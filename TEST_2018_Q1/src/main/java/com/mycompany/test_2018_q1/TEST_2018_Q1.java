/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_2018_q1;

/**
 *
 * @author ethanreddy
 */
public class TEST_2018_Q1 {

    public static void main(String[] args) {
        
        String [] phone = {"iPhone 7", "Samsung 8", "Huawei Mate 10 "}; 
        
        int JAN [] = {30, 20, 25}; 
        
        int FEB [] = {15, 25, 11}; 
        
        int MAR [] = {35, 30, 32}; 
        
        int total [] = {80, 75, 68}; 
        
        int [][] report = {{30, 15, 35, 80}, {20, 25, 30, 75},{25, 11, 32,68}} ;
        
        
        System.out.println("************************************"); 
        System.out.println("TOP CELLPHONE SALES - 2019");
        System.out.println("************************************");
        System.out.printf("%-20s%-12s%-12s%-12s%-12s%n", "", "JAN", "FEB", "MAR", "TOTAL" );
 
        
        for(int i = 0; i < report.length; i++){
            
            System.out.printf("%-20s%-12d%-12d%-12d%-12d%n", phone[i], report[i][0], report[i][1], report[i][2], report[i][3]); 
            
            
        }
        
        int janTotal = 0; 
        int febTotal = 0; 
        int marTotal = 0; 
        
        for(int i = 0; i < report.length; i++){
            
             janTotal = janTotal + report[i][0]; 
             febTotal = febTotal + report[i][1]; 
             marTotal = marTotal + report[i][2]; 
             
            
        }
        
       System.out.printf("%-20s%-12d%-12d%-12d%n",
        "MONTHLY TOTAL",
        janTotal,
        febTotal,
        marTotal);
        
    }
}

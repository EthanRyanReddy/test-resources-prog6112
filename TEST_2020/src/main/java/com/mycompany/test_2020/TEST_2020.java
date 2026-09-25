/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_2020;

/**
 *
 * @author ethanreddy
 */
public class TEST_2020 {

    public static void main(String[] args) {
        
        
        String [] cities = {"JHB", "DBN","CTN", "PE"}; 
        
        int [] JAN = {128, 155, 129, 195}; 
        
        int [] FEB = {135, 129, 130, 155}; 
        
        int [] MAR = {120, 130, 185, 221}; 
        
        
        int [][] report = {{128, 135, 120}, {155, 129, 130}, {129, 130, 185}, {195, 155, 221}};
        
        System.out.println("-------------------------------------");
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("-------------------------------------");
        System.out.printf("%-12s%-12s%-12s%-12s%n",
               
        "CITIES",
        "JAN",
        "FEB",
        "MAR"
                
        ); 
        
        for(int i = 0; i < report.length; i++){
            
            System.out.printf("%-12s%-12d%-12d%-12d%n", cities[i], report[i][0], report[i][1], report[i][2]); 
            
        }
        
        int  max = report[0][0]; 
        int  min = report[0][0];
        
        System.out.println("-------------------------------------");
        System.out.println("SPEEDING FINES STATISTICS");
        System.out.println("-------------------------------------");
        
       for(int i = 0; i < report.length; i++){
           
           for(int j = 0; j < report[i].length; j++){
               
               if(report[i][j] > max){
                   
                   max = report[i][j]; 
               }
               
               if(report[i][j] < min){
                   min = report[i][j]; 
               }
           }
           
       }
       
       System.out.println("MAXIMUM SPEED CAPTURED: " + max);
       System.out.println("MINIMUM SPEED CAPTURED: " + min);
       
       
        
    }
}

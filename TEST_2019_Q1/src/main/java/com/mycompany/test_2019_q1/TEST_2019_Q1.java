/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_2019_q1;

/**
 *
 * @author ethanreddy
 */
public class TEST_2019_Q1 {

    public static void main(String[] args) {
        
        String [] vehcilType = {"SUV", "COUPE", "SEDAN", "VAN"}; 
        
        int [] JAN = {25, 25, 11, 17}; 
        
        int [] FEB = {15, 55, 20, 27}; 
        
        int [] MAR = {35, 35, 45, 25}; 
        
        int [][] report = {{25, 15, 35}, {25, 55, 35}, {11, 20, 45}, {17, 27, 25}}; 
        
        System.out.println("-------------------------------------");
        System.out.println("VEHICLE SALES REPORT");
        System.out.println("-------------------------------------");
        System.out.printf("%-12s%-12s%-12s%-12s%n",
               
        "Vehicle",
        "JAN",
        "FEB",
        "MAR"
                
        );
        
        
        for(int i = 0; i < report.length; i++){
            
             System.out.printf("%-12s%-12d%-12d%-12d%n", vehcilType[i], report[i][0], report[i][1], report[i][2]); 
            
        }
        
        System.out.println("-------------------------------------");
        System.out.println("VEHICLE SALES TOTALS");
        System.out.println("-------------------------------------");
        
        for(int i = 0; i < report.length; i++){
            
            int total = report[i][0] + report[i][1] + report[i][2]; 
            
            if(total >= 100){ 
                
                System.out.println(vehcilType[i] + "  " + total + "(GOLD STAR)"); 
                
                
            }else{
                
                System.out.println(vehcilType[i] + "  " + total + "(SILVER STAR)");
                
                
            }
        }
        
        

        
        
        
    }
}

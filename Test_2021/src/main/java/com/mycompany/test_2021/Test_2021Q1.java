/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_2021;

/**
 *
 * @author ethanreddy
 */
public class Test_2021Q1 {

    public static void main(String[] args) {
        
        
        String [] deliveries = {
        
        "DELIVERIES 2018", 
        "DELIVERIES 2029", 
        "DELIVERIES 2020", 
        }; 
        
        int [] Jan = { 128, 155, 129}; 
        
        int [] Feb = {135, 129,  130}; 
        
        int [] Mar = {139, 175, 185}; 
        
        int [][] report = {{128,135,139}, {155,129,175}, {129,130,185}}; 
        int max = report [0][0];
        int min = report [0][0]; 
        
        
        System.out.println("************************************"); 
        System.out.println("DELIVERY REPORT");
        System.out.println("************************************"); 
        System.out.printf("%-20s%-12s%-12s%-12s%n", "", "Januaray", "February", "March" ); 
        
        
        for(int i = 0; i < report.length; i++){
            
            System.out.printf("%-20s%-12d%-12d%-12d%n", deliveries[i], report[i][0], report[i][1], report[i][2]); 
            
        }
        
        System.out.println("************************************"); 
        System.out.println("DELIVERY STATISTICS");
        System.out.println("************************************"); 
        
        
        int total = 0; 
        
        for(int i = 0; i < report.length; i++){
            
             total = report[i][0] + report[i][1] + report[i][2]; 
            
            
        }
        
        
        
        for(int i = 0; i < report.length; i++){
            
            for(int j = 0; i < report.length; i++){
                
                if(report[i][j] > max){
                    max = report[i][j]; 
                }
                
                if(report[i][j] > min){
                    min = report[i][j]; 
                }
            }
            
        }
        
        System.out.println("Total Deliveries: " + "\t" + total);
        System.out.println("Maximum Deliveries: " + "\t" + max);
        System.out.println("Minimum Deliveries: " + "\t" + min);
        
        
    
    
        
        
    }
}

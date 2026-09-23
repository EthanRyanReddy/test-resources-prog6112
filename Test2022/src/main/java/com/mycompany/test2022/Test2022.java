/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2022;

/**
 *
 * @author reddy
 */
public class Test2022 {

    public static void main(String[] args) {
        
        String [] places = {
            "January", 
            "February", 
            "March",
            "April",
            "May",
            "June"
        }; 
        
        int [] Bathrooms = {
            8, 7, 5, 2, 7, 7
        }; 
        
        int [] Kitchens = {
            2, 4, 5, 2, 7,8
        }; 
        
        int [] Garden = {
            
            5, 5, 2, 3, 9, 5
        }; 
        
        int [][] repairs = {{8, 2, 5}, {7, 4, 5}, {5, 5, 2}, {2, 2, 3}, {7, 7, 9}, {7, 8, 5} }; 
        
        System.out.println("-------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("-------------------------------------");
        System.out.printf("%-12s%-12s%-12s%-12s%n",
        "Month",
        "Bathrooms",
        "Kitchens",
        "Garden");
        
        for(int i = 0; i < repairs.length; i++ ){
            

            
            System.out.printf("%-12s%-12d%-12d%-12d%n", places[i],
                    repairs[i][0],
                    repairs[i][1],
                    repairs [i][2]);
        }
        
        System.out.println("-------------------------------------");
        System.out.println("MONTHLY TOTAL");
        System.out.println("-------------------------------------");
        
        for(int i = 0; i < repairs.length; i++ ){
            
            int total = repairs[i][0] + repairs [i][1] + repairs[i][2];
            
            String stars = ""; 
            
            if(total >= 15){
                
                stars = "***"; 
            }
            
            System.out.printf("%-12s%-12d%-12s%n", places [i], total, stars); 
        }
    }
}

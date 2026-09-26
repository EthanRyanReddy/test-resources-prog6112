/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author ethanreddy
 */
public class Array5 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); 
        int [] numbers = {12, 45, 67, 23, 89, 45, 12, 90, 34, 45};
        int count = 0; 
        
                    
           System.out.println("Enter Number to search: ");
           
           int search = scanner.nextInt();
        
        for(int i = 0; i < numbers.length; i++){
 
            
            if(numbers[i] == search){
                
                count++; 
            }
            
            
            
        }
        
        System.out.println(search + "occurs" + count + "times.");
    }
    
}

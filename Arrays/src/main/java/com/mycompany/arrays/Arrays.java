/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author ethanreddy
 */
public class Arrays {

    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50}; 
        
        for(int i = 0; i < numbers.length; i++){
            
            System.out.println(numbers[i]);
        }
        
        System.out.println("First Number: " + numbers[0]); 
        System.out.println("Last Number: " + numbers[4]); 
        System.out.println("Number of elements: " + numbers.length);
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayexcercise1;

/**
 *
 * @author reddy
 */
public class ArrayExcercise1 {

    public static void main(String[] args) {
       
        //declaring an array
        //int [] numbers = {5, 10, 15, 20, 25}; 
        
        //printing an array
        //System.out.println(numbers[0]);
        //System.out.println(numbers[3]);
        
        //Update a value in an array
        //numbers[0] = 100; 
        
        //System.out.println(numbers[0]);
        
        //determining the length of an array
        //int arrlength = numbers.length; 
        
        //System.out.println(arrlength);
        
        //printing an array using a for loop
        
        //int total = 0; 
        //for(int i = 0; i < numbers.length; i++ ){
            
            //total = total +numbers[i]; 
            
            //System.out.println(numbers[i]);
            
            //System.out.println(total);
        //}
        
       // System.out.println(total);
        
        //find the highest number in an array
        
        int [] num2 = {25, 72, 14, 91, 200}; 
        
        int highest = num2 [0]; 
        
        for(int i = 0; i < num2.length; i++){
            
            if(num2[i] > highest){
                
                highest = num2[i]; 
            }
                
        }
        
        System.out.println(highest);
        
        
        
    }
    
    
}

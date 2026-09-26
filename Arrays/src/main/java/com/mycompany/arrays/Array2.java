/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author ethanreddy
 */
public class Array2 {
    
    
    public static void main(String[] args){
        
        int [] marks = {65, 72, 81, 55, 90, 43, 76, 88, 69, 95}; 
        int total = 0; 
        
        for(int num : marks){
            total += num; 
        }
        
        System.out.println("Total Sum: " + total); 
        
        double average = total/marks.length; 
        
        System.out.println("Average Marks: " + average);
        int max = marks [0]; 
        
        for(int n : marks){
            if(n>max){
                max = n; 
            }
        }
        
        System.out.println("Highest Number: " + max);
        
        int min = marks[0]; 
        
        for(int n : marks){ 
            if(n < min){
                min = n;
            }
        }
        
        System.out.println("Lowest Number: " + min);
        
        
    }
}

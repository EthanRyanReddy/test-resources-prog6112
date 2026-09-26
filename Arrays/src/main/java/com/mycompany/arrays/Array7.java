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
public class Array7 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); 
        
        String [] names= {
            "John",
            "Sarah",
            "Mike",
            "Amy",
            "David"
        };
        
        int [] marks =  {
            75,
            89,
            62,
            94,
            71
        };
        
        System.out.println("Enter Student Name to search: ");
        String student = scanner.nextLine(); 
        
        boolean found = false; 
        
        for(int i = 0; i < names.length; i++){
            
            if(names[i].equalsIgnoreCase(student)){
                found = true; 
                
                System.out.println(names[i] + " Is " + marks[i]);
            }
            
            
        }
        
        if(!found){
            System.out.println("Student does not exist"); 
        }

        
    }
    
}

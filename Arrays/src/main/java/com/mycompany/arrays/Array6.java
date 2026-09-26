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
public class Array6 {
    public static void main(String[] args){
        
        String [] products = {
            "Laptop",
            "iPhone",
            "PlayStation",
            "Xbox",
            "MacBook"
        };
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Please enter the product to be found: ");
        String searchProduct = scanner.nextLine(); 
        
        boolean found = false; 
        
        for(int i = 0; i < products.length; i++){
            
            if(products[i].equalsIgnoreCase(searchProduct)){
                
                found = true; 
            }
            
        }
        
        if(found){
            System.out.println("Product Found");
        }else{
            System.out.println("Product could not be found");
        }
                
            
            
            
        
    }
}

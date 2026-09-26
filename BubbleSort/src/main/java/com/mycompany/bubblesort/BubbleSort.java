/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesort;

import java.util.Scanner;

/**
 *
 * @author ethanreddy
 */
public class BubbleSort {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in); 
        
        int [] height = new int[5]; 
        
        for(int i = 0; i < height.length; i++){
            
            System.out.println("Enter height of player" + (i + 1) + "in cm");
            height[i] = scanner.nextInt(); 
        }
        
        for(int i = 0; i < height.length - 1; i++ ){
            
            for(int j = 0; j < height.length -1; j++){
                
                if(height[j] > height[j + 1]){
                    int temp = height[j]; 
                    height[j] = height[j + 1]; 
                    height[j + 1] = temp; 
                }
            }
        }
        
        System.out.println("\nHeights of team members (descending):");
        
        for (int i = 0; i < height.length; i++) {
            System.out.println(height[i] + " cm");
        }
        
        
    }
}

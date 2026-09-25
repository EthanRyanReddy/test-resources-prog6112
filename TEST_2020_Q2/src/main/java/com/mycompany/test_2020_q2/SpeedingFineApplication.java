/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_2020_q2;

import java.util.Scanner;

/**
 *
 * @author ethanreddy
 */
public class SpeedingFineApplication {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter Citizen Name: ");
        
        String citizenName = scanner.nextLine(); 
        
        System.out.println("Enter Speed: ");
        
        int speed = scanner.nextInt(); 
        
        SpeedingFines fine = new SpeedingFines(citizenName, speed); 
        
        fine.printFine();
        
        scanner.close(); 
        
        
        
        
        
    }
}

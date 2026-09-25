/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_2020_q2;

/**
 *
 * @author ethanreddy
 */
public class SpeedingFines extends Fines{
    
    public SpeedingFines(String name, int speed){
        
        super(name, speed); 
        
        calculateFine(); 
    }
    
    @Override
    public void printFine(){
        
        System.out.println("Citizen Name: " + getName());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Fine Payable (R): " + getFinePayable()); 
    }
}

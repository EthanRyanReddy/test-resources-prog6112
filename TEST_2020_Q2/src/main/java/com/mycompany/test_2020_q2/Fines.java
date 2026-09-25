/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_2020_q2;

/**
 *
 * @author ethanreddy
 */
public abstract class Fines implements iFine {
    
    private String name; 
    private int speed; 
    private double finePayable; 
    
    public Fines(String name, int speed){
        
        this.name = name; 
        this.speed = speed;  
        
    }
    
    public String getName(){
        return name; 
    }
    
    public int getSpeed(){
        
        return speed; 
    }
    
    public double getFinePayable(){
        
        return finePayable; 
    }
    
    public void calculateFine(){
        
        if(speed >= 120){
            finePayable = speed*10.20; 
            
            
            
        }else{
            finePayable = 0; 
        }
    }
    
}

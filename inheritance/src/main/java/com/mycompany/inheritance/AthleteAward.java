/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author reddy
 */
public class AthleteAward extends Athlete{
    
    public AthleteAward(String athleteName, int athleteNum, int performanceScore){
        
        super(athleteName, athleteNum, performanceScore); 
        
        
    }
    
    public void printAthleteReport(){
        
        System.out.println("Athlete Name: " + getAthleteName());
        System.out.println("Athlete Number: " + getAtheleteNum());
        System.out.println("Athlete Award Status: " + getAwardStatus());
    }
    
    
    
}

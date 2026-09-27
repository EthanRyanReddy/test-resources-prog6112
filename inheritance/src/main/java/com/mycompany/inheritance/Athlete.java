/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author reddy
 */
public abstract class Athlete implements iAthlete {
    
    private String athleteName;; 
    private int athleteNum; 
    private int performanceScore; 
    
    public Athlete(String athleteName, int athleteNum, int performanceScore){
        
        this.athleteName = athleteName; 
        this.athleteNum = athleteNum; 
        this.performanceScore = performanceScore; 
        
    }
    
    @Override
    public String getAthleteName(){
        return athleteName; 
    }
    
    @Override
    public int getAtheleteNum(){
        return athleteNum; 
    }
    
    @Override
    public int getPerformanceScore(){
        return performanceScore; 
    }
    
    @Override 
    public String getAwardStatus(){
        
        if(performanceScore >= 75){
            return "YES"; 
        }else{
            return "NO"; 
        }
    }
    
    
    
}

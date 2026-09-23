/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test224;

/**
 *
 * @author reddy
 */
public abstract class RoadAccidents implements IRoadAccidents {
    
    private String accidentVehicleType; 
    private String city; 
    private int accidentTotal; 
    
    public RoadAccidents(String accidentVehicleType, String city, int accidentTotal){
        
        this.accidentVehicleType = accidentVehicleType; 
        this.city = city; 
        this.accidentTotal = accidentTotal; 
    }
    
        
    @Override
    public String getAccidentVehicleType(){
        return accidentVehicleType; 
    }
    
    @Override
    public String getCity(){
        return city; 
    }
    
    @Override
    public int getAccidentTotal(){
        return accidentTotal; 
    }
    
    
    

}



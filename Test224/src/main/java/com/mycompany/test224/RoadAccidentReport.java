/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test224;

/**
 *
 * @author reddy
 */
public class RoadAccidentReport extends RoadAccidents {
    
    public RoadAccidentReport(String accidentVehicleType, String city, int accidentTotal){
        
        super(accidentVehicleType, city, accidentTotal); 
    }
    
    
    public void printAccidentReport(){
        
        System.out.println("Vehicle Type: " + getAccidentVehicleType());
        System.out.println("City: " + getCity());
        System.out.println("Accident Total: " + getAccidentTotal());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.test224;

/**
 *
 * @author reddy
 */
public class RunApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RoadAccidentReport report = new RoadAccidentReport("Cars", "Cape Town", 115); 
        
        report.printAccidentReport();

    }
    
}

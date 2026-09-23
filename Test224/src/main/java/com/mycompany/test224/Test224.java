/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test224;

/**
 *
 * @author reddy
 */
public class Test224 {

    public static void main(String[] args) {
        
        //Single dimensional array for city name
        String [] cities = {
            "Cape Town", 
                "Johannesburg", 
                "Port Elizabeth"
        }; 
        
        int [] carAccidents = {
            155, 178, 112
        }; 
        
        int [] moterbikeAccidents = { 121, 145, 89}; 
        
        //Two-dimensional arry
        //Column 0 = Cars 
        //Column 1 = Motorbikes
        
        int [][]accidents = {
            
            {155, 121},
                {178, 145},
                {112,82}
        }; 
        
        System.out.println("Road Accident Report");
        System.out.println("-----------------------");
        System.out.println("City\t\t\tCars\tMotor Bikes\tTotal");
        
        int highestTotal = 0; 
        String highestCity = ""; 
        
        //Loops through each city 
        for(int i =0; i < accidents.length; i++){
            
            //this calculates the total accidents for the current country
            int total = accidents[i][0] + accidents [i][1]; 
            
            //Display the city and accident info
            System.out.println(cities[i] + "\t\t" +
                    accidents[i][0] + "\t" + 
                    accidents [i][1] + "\t\t" + total);
            
            if(total > highestTotal){
                highestTotal = total; 
                highestCity = cities[i]; 
            }
            
            
            
        }
        
        System.out.println(); 
        System.out.println("City with the highest number of accidents: ");
        System.out.println(highestCity);
        System.out.println("Total accidents: " + highestTotal);
        
    }
}

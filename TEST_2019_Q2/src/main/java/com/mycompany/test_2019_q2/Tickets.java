/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_2019_q2;

/**
 *
 * @author ethanreddy
 */
public abstract class Tickets implements iTickets{
    
    private String customerName; 
    private String movieTitle; 
    private int customerAge; 
    private int moviePrice; 
    private double discount; 
    private double finalCost; 
    
    public Tickets(String customerName, String movieTitle, int customerAge, int moviePrice){
        
        this.customerName = customerName; 
        this.movieTitle = movieTitle; 
        this.customerAge = customerAge; 
        this.moviePrice = moviePrice; 
                
        
    }
    
    public String getCustomerName(){
        
        return customerName; 
    }
    
    public String getMovieTitle(){
        
        return movieTitle; 
    }
    
    public int getCustomerAge(){
        
        return customerAge; 
    }
    
    public int getMoviePrice(){
        
        return moviePrice; 
    }
    
        
    
}

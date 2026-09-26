/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_2019_q2;

/**
 *
 * @author ethanreddy
 */
public class TicketSales extends Tickets{
    
    private double discount; 
    private double finalCost; 
    
    public TicketSales(String customerName, String movieTitle, int customerAge, int moviePrice){
        
        super(customerName, movieTitle, customerAge, moviePrice); 
        
        calculateDiscount(); 
    }
    
    public void calculateDiscount(){
        
        if(getCustomerAge() >= 65){
            
            discount = getMoviePrice() * 0.10; 
            finalCost = getMoviePrice() - discount; 
            
        }else{
            
            discount = 0; 
            finalCost = getMoviePrice(); 
        }
    }
    
    @Override
    
    public void print_tickets(){
        
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Movie Title: " + getMovieTitle());
        System.out.println("Customer Age: " + getCustomerAge());
        System.out.println("Movie Ticket Price: " + getMoviePrice());
        System.out.println("Discount Amount: " + discount); 
        System.out.println("Total Amount: " + finalCost);
    }
    
    
}

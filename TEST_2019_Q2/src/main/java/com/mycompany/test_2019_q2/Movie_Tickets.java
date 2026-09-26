/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_2019_q2;

import java.util.Scanner;

/**
 *
 * @author ethanreddy
 */
public class Movie_Tickets {

    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner (System.in); 
        
        System.out.println("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        
        System.out.println("Enter Movie Title");
        String movieTitle = scanner.nextLine(); 
        
        System.out.println("Enter Age: ");
        int customerAge = scanner.nextInt(); 
        
        System.out.println("Enter ticket price: ");
        int moviePrice = scanner.nextInt(); 
        
        TicketSales sales = new TicketSales(customerName, movieTitle, customerAge, moviePrice); 
        
        sales.print_tickets();
        
        scanner.close();
        
        
        
        
    }
}

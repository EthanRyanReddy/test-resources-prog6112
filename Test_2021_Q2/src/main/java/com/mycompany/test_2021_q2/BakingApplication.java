/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_2021_q2;

/**
 *
 * @author ethanreddy
 */
public class BakingApplication {

    public static void main(String[] args) {
        
        ProcessRecipie recipie = new ProcessRecipie(
        "Flour, Eggs, Milk", 30, 2); 
        
        recipie.PrintRecipies();
    }
}

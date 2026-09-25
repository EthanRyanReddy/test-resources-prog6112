/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_2021_q2;

/**
 *
 * @author ethanreddy
 */
public class ProcessRecipie extends Recipies {
    
    public ProcessRecipie(String ingredients, int timeToMake, int difficultyLevel){
        
        super(ingredients, timeToMake, difficultyLevel); 
    }
    
    @Override
    public void PrintRecipies(){
        
        System.out.println("Ingredients Needed: " + getIngredients());
        System.out.println("Time Taken To Make: " + getTImeToMake());
        System.out.println("Difficulty Level: " + getDifficultyLevel()); 
        
    }
    
}

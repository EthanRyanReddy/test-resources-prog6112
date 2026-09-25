/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_2021_q2;

/**
 *
 * @author ethanreddy
 */
public abstract class Recipies implements IRecipies {
    
    private String ingredients; 
    private int timeToMake; 
    private int difficultyLevel; 
    
    public Recipies(String ingredients, int timeToMake, int difficultyLevel){
        
        this.ingredients = ingredients; 
        this.timeToMake = timeToMake; 
        this.difficultyLevel = difficultyLevel; 
    }
    
    public String getIngredients(){
        
        return ingredients; 
    }
    
    public int getTImeToMake(){
        
        return timeToMake; 
    }
    
    public int getDifficultyLevel(){
        
        return difficultyLevel; 
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_2018_q2;

/**
 *
 * @author ethanreddy
 */
public abstract class Students implements iReport{
    
    private String stNum; 
    private int testResult; 
    private int assignmentResult; 
    private int examResult; 
    
    public Students (String stNum, int testResult, int assignmentResult, int examResult){
        
        this.stNum = stNum; 
        this.testResult = testResult; 
        this.assignmentResult = assignmentResult; 
        this.examResult = examResult; 
    }
    
    public String getStNum(){
        return stNum; 
    }
    
    public int getTestResult(){
        
        return testResult; 
    }
    
    public int getAssignmentResult(){
        return assignmentResult; 
    }
    
    public int getExamResult(){
        return examResult; 
    }
}

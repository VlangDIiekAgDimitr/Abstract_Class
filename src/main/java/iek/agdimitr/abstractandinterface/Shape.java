/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.agdimitr.abstractandinterface;

/**
 *
 * @author avlonitiss
 */
public abstract class Shape {
     // Δήλωση πεδίων
    String objectName = " ";
 
    // δήλωση constructor
    Shape(String name) { 
        this.objectName = name; 
    }
    
    // δήλωση non-abstract methods
    // it has default implementation
    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " "
                           + "has been moved to"
                           + " x = " + x + " and y = " + y);
    }
    
    // δήλωση abstract methods που
    // υλοποιούνται στις υποκλάσεις
    // ή σε μία υποκλάση
    
    abstract public double area();
    abstract public void draw();
    
}

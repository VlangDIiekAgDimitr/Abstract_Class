/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.agdimitr.abstractandinterface;

/**
 *
 * @author User
 */

// Πρόγραμμα Java για παρουσίαση
// της έννοιας της abstract class
public class Rectangle extends Shape {
    
      // Προσθήκη νέων πεδίων
    int length, width;
 
    // δημιουργία νέου constructor με τα νέα και τα κληρονομούμενα πεδία
    Rectangle(int length, int width, String name)
    {
 
        super(name);           //κληρονομούμενο πεδίο
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
               return (double)(length * width);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
         }
    
    
}

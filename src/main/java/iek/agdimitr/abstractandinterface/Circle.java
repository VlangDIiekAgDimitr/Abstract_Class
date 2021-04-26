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
public class Circle extends Shape {

    double pi = 3.14;
    int radius;
 
    // constructor
    Circle(int radius, String name)
    {
        super(name);
        this.radius = radius;
    }
 
    @Override
    public double area() {
        return (double)((pi * radius * radius) / 2);
    }

    @Override
    public void draw() {
    System.out.println("Circle has been drawn ");
    }
    
}

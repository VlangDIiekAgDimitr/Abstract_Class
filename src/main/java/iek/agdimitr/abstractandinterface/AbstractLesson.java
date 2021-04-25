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
public class AbstractLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
         // Δημιουργία αντικειμένου Rectangle class
        // με αναφορά Shape class 
        Shape rect = new Rectangle(2, 3, "Rectangle");
        System.out.println("Area of rectangle: "
                           + rect.area()); // μέθοδος της Rectangle
        rect.moveTo(1, 2);  // μέθοδος της Shape
 
        System.out.println(" ");
 
        // Δημιουργία αντικειμένου Circle class
        Shape circle = new Circle(2, "Cicle");
        System.out.println("Area of circle: "
                           + circle.area()); // μέθοδος της Circle
        circle.moveTo(2, 4); // μέθοδος της Shape
    }
    }
    

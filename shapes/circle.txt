package com.company;

import java.util.Scanner;

public class circle {

    static Scanner input = new Scanner(System.in);                                  // object input from class Scanner to input

    public static void Circle_Area (double r) {							// method to calculate the circle area 
        System.out.println("Enter The Circle Radius to Calculate the Area : "); 	// ask user to input radius of circle 
        double red = input.nextDouble();
        double CircleArea = (red * red * 3.14); 						// Public Law to calculate the circle area 
        System.out.println("Area of Circle =" + CircleArea); 				// print the cicle area 
    }
    public static void Circle_Circumference (double r) { 					// method to calculate the circle Circumference 
        System.out.println("Enter The Circle Radius to Calculate the Circumference : "); 		// ask user to input radius of circle 
        double red = input.nextDouble();
        double CircleCircumference = (2 * red * 3.14);					// Public Law to calculate the circle Circumference 
        System.out.println("Circumference of Circle =" + CircleCircumference); 	// print the cicle Circumference 
    }

}

package com.company;

import java.util.Scanner;

public class triangle {
    static Scanner input = new Scanner(System.in); 						// object input from class Scanner to input


    public static void Triangle_Area (double b , double h) { 				// method to calculate triangle area 
        System.out.println("Enter The Triangle Base to Calculate the Area : "); 	// ask user to input the base length of triangle 
        double Base = input.nextDouble();
        System.out.println("Enter The Triangle high to Calculate the Area : "); 	// ask user to input the hight length of triangle 
        double High = input.nextDouble();
        double TriangleArea = (.5 * Base * High); 						// Public Law to calculate the triangle area 
        System.out.println("Area of Triangle =" + TriangleArea);				// print the triangle area 
    }
    public static void Triangle_circumference (double a ,double b , double c) {	//  method to calculate triangle area 
        System.out.println("Enter The Triangle Length #1 to Calculate the Circumference : ");
        double l1 = input.nextDouble();
        System.out.println("Enter The Triangle Length #2 to Calculate the Circumference : ");
        double l2 = input.nextDouble();
        System.out.println("Enter The Triangle Length #3 to Calculate the Circumference : ");
        double l3 = input.nextDouble();
        double TriangleCircumference = (l1 + l2 + l3);					// Public Law to calculate the triangle Circumference 
        System.out.println("Circumference of Circle =" + TriangleCircumference); 	// print the triangle Circumference 
    }
}

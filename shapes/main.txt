package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);           // object input from class Scanner to input
                System.out.println("Choose The Shape That you Want To Calculate The Area and The Circumference : ");
                System.out.println("1) Circle ");
                System.out.println("2) Triangle ");

                int in = input.nextInt();
                switch (in) {  				// switch statement 
                    case 1:					// to calculate are and circumference of circle 
                        circle.Circle_Area(2);
                        circle.Circle_Circumference(2);
                        break;
                    case 2:					// to calculate are and circumference of triangle 
                        triangle.Triangle_Area(2, 4);
                        triangle.Triangle_circumference(2, 4, 5);
                        break;

                    default:
                        System.out.println("try again ");
                        break;


                }


        }
    }






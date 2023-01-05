package com.company;

import java.util.Scanner;

public class Main {



    public static int fact (int x){ 					// method to calculate factorial of any number 
        int f= 1 ;
        for (int i = 1 ; i <= x ; i ++){

            f*=i ;
        }


        return f ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 				// object in from class Scanner to input

        System.out.println("enter n :");					// ask user to input n 
        int n = in.nextInt();

        System.out.println("enter r :");					// ask user to input r 
        int r = in.nextInt();

        int z = n-r ;

        int nCR = fact(n)/(fact(z)*fact(r)) ;     // قانون التوافيق
        int nPR = fact(n)/fact(z) ;               // قانون التباديل 
        
        System.out.println(nCR);
        System.out.println(nPR);




    }
}

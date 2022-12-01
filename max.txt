package com.company;

import java.util.Scanner;

public class Main {
   static Scanner n =new Scanner(System.in) ;               // object n from class Scanner to input


    public static void main(String[] args) {
System.out.println("enter array size : ");			// ask user to input the size of array
int size = n.nextInt(); 						// take the size 
int []maxNumber = new int[size] ;					// we built an array with name maxNumber 
for (int i = 0 ; i< maxNumber.length ; i ++){			// for loop to take array elements 
    System.out.println("enter array number : " + (i+1));
    maxNumber[i] = n.nextInt() ;

}

int max = 0 ;
        max=maxNumber[0];						// we suppose the max number is in index 0
for (int i = 0 ; i < maxNumber.length ; i ++){   		// for loop to pass the array elements 
    
   if (max<maxNumber[i])						// compare the max number we supposed with the array elements
       max = maxNumber[i];						// if number > max  --> max = number

}
System.out.println("max number = " + max);			// print max number 




    }
}

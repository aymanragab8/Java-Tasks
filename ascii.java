package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in) ;            // object n from class Scanner to input


        System.out.println("enter char :");             // ask user to input char to covert to ascii code
        char ch = n.next().charAt(0);                   // input character in variable ch
        System.out.println((int)ch);                    // print the ascii code after coverting char


        System.out.println("enter ascii code :");     //  ask user to input ascii to covert to char
        int asc = n.nextInt();                        //  input ascii as integer number in variable asc
        System.out.println((char) asc);			//  print the char after coverting the ascii code



    }
}

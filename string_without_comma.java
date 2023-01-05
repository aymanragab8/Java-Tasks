package com.company;

import java.util.Scanner;

public class Main {

    public String replaceAll(String regex, String replacement) { 			method to replace 
        return null;
    }


    public static void main(String[] args) {

        Scanner n = new Scanner(System.in) ;            // object n from class Scanner to input

        System.out.println("enter string :");  		  // ask user to input any string 
        String str =n.next();
        str = str.replaceAll(",","");			  // using a replace method , we replace any comma (",") with null ("")
        System.out.println(str);				  // print string without comma (,) 

 
    }
}

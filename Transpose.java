package com.company;

import java.util.Scanner;

public class Main {
   static Scanner n =new Scanner(System.in) ;       						 // object n from class Scanner to input

    public static void main(String[] args) {

        int[][] Matrix = { {3, -2, 5}, {3, 0, 4} }; 						// two dimintional array 2*3


int raw = Matrix.length ; 										// store length of raws in variable raw
int col = Matrix[0].length ;										// store length of colums in variable col


        int[][] Matrix2 = new int[col][raw];
        for (int i = 0 ; i<col ; i ++){                                                 // 3  3
                                                                                         // -2 0
                                                                                        // 5  4
            for (int j = 0 ; j<raw ; j ++){

                Matrix2[i][j] =Matrix[j][i];
            }


        }
        for (int i = 0 ; i< Matrix2.length ; i ++) { 						// make raws as colums in transposed matrix 

            for (int j = 0 ; j<Matrix2[0].length ; j ++){					// make colums as raws in transposed matrix 

                System.out.print(Matrix2[i][j] + " "); 					// print the matrix after transposed

            }
            System.out.println();
        }





    }
}

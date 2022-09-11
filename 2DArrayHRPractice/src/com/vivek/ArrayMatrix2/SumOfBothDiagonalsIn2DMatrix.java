package com.vivek.ArrayMatrix2;
import java.util.Scanner;
//Find Sum of all Diagonals Elements in Matrix
public class SumOfBothDiagonalsIn2DMatrix {
	public static void main(String...args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows/columns in matrix : ");    //rows and columns in matrix must be same.
        int rows = scanner.nextInt();
        int columns=rows;
        int[][] matrix = new int[rows][rows];
        
        System.out.println("Enter the elements in matrix :");
        for (int i = 0; i < rows; i++) {
               for (int j = 0; j < columns; j++) {
                     matrix[i][j] = scanner.nextInt();
               }
        }

        //Logic to calculate sum of diagonal1
        int sumOfDiagonal1=0;
        for (int i = 0, j =0; i< rows && j < columns; i++, j++) {
               sumOfDiagonal1= sumOfDiagonal1 + matrix[i][j];
               
        }
        
        //Logic to calculate sum of diagonal2
        int sumOfDiagonal2=0;
        for (int i=0,j=columns-1 ; i<rows && j>=0 ; i++, j--) {
               sumOfDiagonal2= sumOfDiagonal2 + matrix[i][j];
               
        }

        System.out.println("\nMatrix is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                     System.out.print(matrix[i][j] + " ");
               }
               System.out.println();
        }

        System.out.println("sum of diagonal1 elements="+sumOfDiagonal1+"\n" );
        System.out.println("sum of diagonal2 elements = "+ sumOfDiagonal2 +"\n");
        System.out.println("sum of diagonal1 and diagonal2 elements is: "+ (sumOfDiagonal1+ sumOfDiagonal2) );

 }
}

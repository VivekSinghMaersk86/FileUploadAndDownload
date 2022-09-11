package com.vivek.MatrixArray;
import java.util.Scanner;
//JAVA Code for print Boundary elements of a Generic  Matrix
public class PrintBoundaryMatrixElement {
	public static void main(String args[]) {
        //1
        int row, col;
        
        //2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of rows : ");
        row = scanner.nextInt();
        
        //3
        System.out.println("Enter total number of columns : ");
        col = scanner.nextInt();
        
        //4
        int inputArray[][] = new int[row][col];
        
        //5
        System.out.println("Enter element of defined matrix:-  ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                /*System.out.println("Enter element for array[" + (i + 1) + "," + (j + 1) + "] : ");*/
                inputArray[i][j] = scanner.nextInt();
            }}
        
        //6
        System.out.println("Original Entered Matrix 2D Arrays: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(inputArray[i][j] + "\t");
            }
            System.out.println();
        }
        
        //7
        System.out.println("The boundary elements of this matrix are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    System.out.print(inputArray[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }}
            System.out.println();
        }}}

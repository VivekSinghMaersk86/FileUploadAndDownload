package com.vivek.MatrixArray;
import java.util.Scanner;

public class Reverse2DMatrixArray {
 	public static void reverse_it(int[][] my_array){
		int my_rows = my_array.length;
		    int my_cols = my_array[0].length;
		    int array[][]=new int[my_rows][my_cols];
		    for(int i = my_rows-1; i >= 0; i--) {
		        for(int j = my_cols-1; j >= 0; j--) {
		            array[my_rows-1-i][my_cols-1-j] = my_array[i][j];
		        }
		    }
		    System.out.println("The Resulting Reverse Array is:- ");
		    for(int i = 0; i < my_rows; i++) {
		        for(int j = 0; j < my_cols; j++) {
		            System.out.print(array[i][j]+" ");
		            if((j + 1) % 3 == 0)
				     System.out.print("\n");
		            }
		     }
		}
		public static void main(String[] args) throws Exception {
		    int my_rows, my_cols;
		    ;
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter number of rows:- \n");
		    my_rows = input.nextInt();
		    System.out.print("Enter number of columns:- \n");
		    my_cols = input.nextInt();
		    int[][] my_array= new int[my_rows][my_cols];
		    System.out.println("Enter elements of Array:- \n");
		    for (int i = 0; i < my_rows; i++) {
		        for (int j = 0; j < my_cols; j++) {
		            my_array[i][j] = input.nextInt();
		     }}
		    System.out.println("Original or Inserted Array is: ");
		    for (int i = 0; i < my_rows; i++) {
		        for (int j = 0; j < my_cols; j++) {
		        System.out.print(my_array[i][j]+" ");
		        if((j + 1) % 3 == 0)
		        System.out.print("\n");
		   }}
		    System.out.println();
		    reverse_it(my_array);
		}}

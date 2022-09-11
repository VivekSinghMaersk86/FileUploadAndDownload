package com.vivek.Other20;
//Java program to change value of diagonal elements of a matrix to 0.
public class MatrixDigonalPlusModifiedNttData {
	static final int MAX = 100; 
	  
	// to print the resultant matrix  
	static void print(int mat[][], int n, int m)  
	{ 
	    for (int i = 0; i < n; i++)  
	    { 
	        for (int j = 0; j < m; j++)  
	        { 
	            System.out.print(mat[i][j] + " "); 
	        } 
	  
	        System.out.println(); 
	    } 
	} 
	  
	// function to change the values of diagonal elements to 0  
	static void makediagonalzero(int mat[][],int n, int m) 
	{ 
	    for (int i = 0; i < n; i++){ 
	        for (int j = 0; j < m; j++){	  
	            // right and left diagonal condition  
	            if (i != j && (i + j + 1) != n){ 
	                mat[i][j] = 0; 
	            } 
	        }} 
	  
	    // print resultant matrix  
	    print(mat, n, m); 
	} 
	  
	// Driver code  
	public static void main(String args[])  
	{ 
	    int n = 3, m = 3; 
	   /* Here diagonal central element, I have change as per interviews question 0*/
	    int mat[][] = {{2, 1, 7}, 
	                   {3, 0, 2}, 
	                   {5, 4, 9}}; 
	  
	    makediagonalzero(mat, n, m); 
	} 
}

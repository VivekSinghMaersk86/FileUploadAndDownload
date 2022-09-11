package com.vivek.MatrixArray;
import java.util.Arrays; 
//Java implementation to sort the matrix row-wise and column-wise
public class Sort2DMatrixbyRowcolumn {
	static final int MAX_SIZE=10; 
    
    // function to sort each row of the matrix 
    static void sortByRow(int mat[][], int n) 
    { 
        for (int i = 0; i < n; i++) 
      
            // sorting row number 'i' 
            Arrays.sort(mat[i]); 
    } 
      
    // function to find transpose of the matrix 
    static void transpose(int mat[][], int n) 
    { 
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++)  
                { 
                // swapping element at index (i, j)  
                // by element at index (j, i) 
                int temp=mat[i][j]; 
                mat[i][j]=mat[j][i]; 
                mat[j][i]=temp; 
                } 
    } 
      
    // function to sort the matrix row-wise 
    // and column-wise 
    static void sortMatRowAndColWise(int mat[][],int n) 
    { 
        // sort rows of mat[][] 
        sortByRow(mat, n); 
      
        // get transpose of mat[][] 
        transpose(mat, n); 
      
        // again sort rows of mat[][] 
        sortByRow(mat, n); 
      
        // again get transpose of mat[][] 
        transpose(mat, n); 
    } 
      
    // function to print the matrix 
    static void printMat(int mat[][], int n) 
    { 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print(mat[i][j] + " "); 
            System.out.println(); 
        } 
    }  
      
    // Driver code  
    public static void main (String[] args) 
    { 
        int mat[][] = { { 4, 1, 3 }, 
                        { 9, 6, 8 }, 
                        { 5, 2, 7 } }; 
        int n = 3; 
      
        System.out.print("Original Matrix:\n"); 
        printMat(mat, n); 
      
        sortMatRowAndColWise(mat, n); 
      
        System.out.print("\nMatrix After Sorting:\n"); 
        printMat(mat, n); 
    } 
}

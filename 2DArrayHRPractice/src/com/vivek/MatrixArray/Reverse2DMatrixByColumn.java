package com.vivek.MatrixArray;
//Program to reverse the Columns in a 2d Array
public class Reverse2DMatrixByColumn {
	
	public static void main(String args[]) {

        int[][] matrix = new int[][] {
            new int[]{  1,  2,  3,  4,  5 },
            new int[]{  6,  7,  8,  9, 10 },
            new int[]{ 11, 12, 13, 14, 15 },
            new int[]{ 16, 17, 18, 19, 20 },
            new int[]{ 21, 22, 23, 24, 25 },  };
        
        System.out.println("Original Input Matrix:- ");
        printMatrix(matrix);
        
        // code start
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int x = 0; x < rows; x++) {
        	
        	for(int y = 0; y < cols / 2; y++) {
        		
        		int temp = matrix[x][y];
        		matrix[x][y] = matrix[x][cols - y - 1];
        		matrix[x][cols - y - 1] = temp;
        	}
        }
        // code end
        
        System.out.println("After Matrix Reverse By Columns:- ");
        printMatrix(matrix);
	}
	
	private static void printMatrix(int[][] matrix) {
		
		for(int[] row : matrix) {
			
			for(int col : row) {
				
				String toPrint = col + " ";
				if(col < 10)
					toPrint = "0" + toPrint;
				System.out.print(toPrint);
			}
			
			System.out.println();
		}
	}
}

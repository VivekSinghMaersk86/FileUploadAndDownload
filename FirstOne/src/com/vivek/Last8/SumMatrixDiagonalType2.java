package com.vivek.Last8;
import java.util.Scanner;

public class SumMatrixDiagonalType2 {
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    
    //Declare three 2 Dimensional Arrays
    int[][] matrix=new int[4][4];
    int sum=0;
    
    //input matrix
    System.out.println("Enter the matrix order 4*4");
    for(int i=0 ; i<matrix.length ; i++){
    System.out.println("Enter element of"+ i + "row");	
    for(int j=0 ; j<matrix[i].length ; j++){
       matrix[i][j]=getInt(scan,"");	
        } }  
    
   //Diagonal element adding logic
    for(int i=0 ; i< matrix.length ;i++){
    for(int j=0 ; j<matrix[i].length ; j++){
    		if(i==j){
    			sum+=matrix[i][j];
    		}}}
    
    System.out.println("Sum of Digonal Element is"+ sum);    
	}
	private static int getInt(Scanner scan , String prompt){
		int integer=0;
		boolean isValid=false;
		while(isValid==false){
			System.out.print(prompt);
			if(scan.hasNextInt()){
			integer=scan.nextInt();
			isValid=true;			
			} else {
				System.err.println("Error ! Invalid number .try again. ");
			}
			scan.nextLine();
		}
		return integer;
	}}

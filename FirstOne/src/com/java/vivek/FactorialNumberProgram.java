package com.java.vivek;
import java.util.Scanner;

public class FactorialNumberProgram {

	public static void main(String[] args) {
	 int n ,fact =1;
     System.out.println("Enter an integer no to calculate factorial");
     Scanner scan=new Scanner(System.in);
     n=scan.nextInt();
    if(n<0){
     System.out.println("Number should be non-negative");	
    }else{
    	for(int c=1; c<= n; c++){
    		fact=fact*c;    		  		
    	}
    	System.out.println("Factorial of "+ n +" is ="+fact);
    }   
	} }
//write a program to calculate factorial of given number using iterator
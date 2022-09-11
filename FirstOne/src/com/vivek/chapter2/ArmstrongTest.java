package com.vivek.chapter2;

import java.util.Scanner;

public class ArmstrongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Please enter three digite number to find if it's Armstrong Number:");
    /*int num=new Scanner(System.in).nextInt();*/
    Scanner scan=new Scanner(System.in);
    int Number=scan.nextInt();
    
    //printing Result
    if(isArmstrong(Number)){
    System.out.println("Number :"+ Number + "is an Armstrong Number" );	    	
    }else{
    System.out.println("Number :"+ Number + "is not an Armstrong Number" );	
    }
	}
	private static boolean isArmstrong(int number) {
		int result=0;
		int orig=number;
		while(number != 0){
			int remainder=number%10;
			result=result+remainder*remainder*remainder;
			number=number/10;
		}
		//Number is Armstrong return true
		if(orig==result){
			return true;
		}
		return false;
	}}

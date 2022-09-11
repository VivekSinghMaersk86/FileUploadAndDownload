package com.java.vivek;
import java.util.Scanner;

public class FibonacciSeriesProgram {
public static void main(String[] args) {
/*int febCount = 15;*/
	
//OR---Generic way to enter number
	
System.out.println("Please Enter the number for febonacci:- ");
Scanner scan=new Scanner(System.in);
int febCount=scan.nextInt();

 int[] feb=new int[febCount];
 feb[0]=0;
 feb[1]=1;
 for(int i=2 ;i< febCount ;i++){
	 feb[i]= feb[i-1] + feb[i-2];
 }
 for(int i=0 ;i< febCount ;i++){
	 System.out.println(feb[i]+" ");
 }}}

/*To Create Fibonacci series ,in mathematics -the Fibonacci number or sequence are in the following way-If you give 8 then 
0,1,1,2,3,5,8,13--In Mathmatices, subsequent number is the sum of the previous two number */
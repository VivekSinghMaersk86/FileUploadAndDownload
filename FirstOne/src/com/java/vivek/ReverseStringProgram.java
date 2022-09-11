package com.java.vivek;
import java.io.*;
import java.util.Scanner;

public class ReverseStringProgram {
public static void main(String[] args) throws IOException {
	System.out.println("Enter String:");
	
	/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String strx=br.readLine();*/
	
	//OR
	
	Scanner scan=new Scanner(System.in);
    String strx=scan.nextLine();
	
	String reverse="";
	int length =strx.length();
	
	for(int i=length-1;i>=0 ;i--)
		reverse = reverse + strx.charAt(i);
	System.out.println("Result:"+reverse);
	}
}
//Reverse Each word of given string without altering their position
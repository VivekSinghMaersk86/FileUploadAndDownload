package com.vivek.Java8;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the String");
		String str=scan.nextLine();
		System.out.println(removeDuplicates(str));
    }
 
	private static String removeDuplicates(String str) {
	    StringBuilder sb = new StringBuilder();
	    char[] arr = str.toCharArray();
	 
	    for (char ch : arr) {
	        if (sb.indexOf(String.valueOf(ch)) != -1)
	        	sb.append("*");
	        else
	            sb.append(ch);
	    }
	    return sb.toString();
	}
}
 


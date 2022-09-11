package com.java.vivek;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);
	}}
class TooOldException extends RuntimeException{
	  TooOldException(String s){
		super(s);
	}}
public class UserDefinedException {
public static void main(String[] args) {
	System.out.println("Please Enter the age");
	Scanner scan=new Scanner(System.in);
	int age=scan.nextInt();
	
	 if(age>60){
		 throw new TooYoungException("Your age is already cross of married");
	 }else if(age<18){		 
		 throw new TooOldException("Your age is less no chance to get married");		 
	 }else{
		 System.out.println("you will get match by email");
	 }}}

package com.java.chapter4;
import java.io.*;
import java.util.Scanner;

public class ReadWriteFileToCosnoleRev {
	public static void main(String[] args) throws IOException{
		// Part 1st:-Read the data from console and write in the File
		FileWriter fw=  new FileWriter("C:\\Hello.txt");
		System.out.println("Enter an String on the console");
	     Scanner scan=new Scanner(System.in);
	     String Stry=scan.nextLine();
	     fw.write(Stry);
	     fw.close();
	  // Part 2nd:-Read the data from File and write in the Console
	     
	    /* BufferedReader br=new BufferedReader(new FileReader("C:\\Hello.txt"));
	     String str="";
	     String Line=null;
	     while((Line = br.readLine()) !=null){
	    	 str+=Line;
	    	}
      System.out.println(str);*/
     fw.close();
	}

}

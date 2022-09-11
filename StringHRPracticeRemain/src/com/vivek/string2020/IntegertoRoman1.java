package com.vivek.string2020;
import java.util.Scanner;
//Java program to Convert Integer Number to Roman Number.
public class IntegertoRoman1 {

	public static void main(String[] args) {
		int num;
		  System.out.println("please the number between 1 t0 5000");
		  Scanner obj = new Scanner(System.in);
		  num = obj.nextInt();
		  String str = String.valueOf(num);
		  char []arr = str.toCharArray();

		  int len = str.length();
		  int count[] = new int[10];
		  for(int i=0;i<len;i++)
		    {
		      count[i] = (int)arr[i]-48;
		    }
		  String ones[] = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
		  String tens[] = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
		  String hundred[] = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};
		  String thousand[] = new String[]{"","M","MM","MMM","MMMM","~V"};
		 if(len==4 && num<=5000){
		   String romancounting = thousand[count[0]]+ hundred[count[1]] + tens[count[2]] + ones[count[3]];

		   System.out.println(romancounting);
		 }
		  else if(len==3)
		  {
		  String romancounting = hundred[count[0]]+tens[count[1]]+ones[count[2]];
		    System.out.println(romancounting);
		  }
		  else if(len==2){
		     String romancounting = tens[count[0]]+ones[count[1]];
		     System.out.println(romancounting);
		  }else if(len==1){
			  String romancounting =ones[count[0]];
			  System.out.println(romancounting); 
			  
		  }else{
			  
		       System.out.println("Sorrt But number is invalid! OutOfRange👌");
		       
		     }}}



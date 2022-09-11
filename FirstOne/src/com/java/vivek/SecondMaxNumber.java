package com.java.vivek;

public class SecondMaxNumber {
  public void printTwoMaxNumbers(int[] nums){
	  int maxone=0;
	  int maxtwo=0;
	  for(int n:nums){
		if(maxone<n){
			maxtwo =maxone;
			maxone=n;			
		}else if(maxtwo<n){
			maxtwo=n;
		}
	  }
	  System.out.println("First Max Number"+maxone);
	  System.out.println("Second Max Number"+maxtwo);
  }	
	public static void main(String[] args) {
    int[] num={5,34,78,2,45,1,99,23};
    SecondMaxNumber SecMaxNum=new SecondMaxNumber();
    SecMaxNum.printTwoMaxNumbers(num);

	}

}
//print the second max number of array
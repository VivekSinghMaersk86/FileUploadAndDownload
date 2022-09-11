package com.vivek.Last8;
import java.io.IOException;

public class SumMatrixDiagonal {
  public static void main(String[] args) throws IOException {
  int d[][]={{1,2,6} ,{3,8,5} ,{5,6,7}};
  int k=0, j=0;
  int sum1 = 0, sum2=0;
  for(j =0 ; j< d.length ; j++){
	  for(k=0 ; k <d.length ;k++){
		  System.out.print(d[j][k] +" ");
		  System.out.println();
	  }
	  for(j =0 ; j< d.length ; j++){
		  sum1=sum1 + d[j][j];
	  }
	  k=d.length-1;
	  for(j =0 ; j< d.length ; j++){
		  if(k>=0){
			  sum2= sum2 + d[j][k];
			  k--;
		  }}
	 System.out.println("Sum of digonal elements are \n firstSum:" + sum1 + "\n and \n Second Sum :"+ sum2); 
  }	}}

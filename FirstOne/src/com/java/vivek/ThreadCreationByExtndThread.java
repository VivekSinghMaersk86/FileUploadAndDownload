package com.java.vivek;

class MyThread extends Thread{
	public void run(){
		  for(int i=0 ; i<=25 ;i++){
			  System.out.println("run"+i);
		  }
	  }
}
public class ThreadCreationByExtndThread{
  public static void main(String[] args) {
	  MyThread thrd1=new MyThread();
	  thrd1.start();
	  for(int i=0 ; i<=25 ;i++){
		  System.out.println("start"+i);
	  }	}}

//User Defined thread by using Thread Class
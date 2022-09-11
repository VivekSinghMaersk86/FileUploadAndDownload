package com.java.vivek;

class A{
	public synchronized void foo(B b){
		System.out.println("Thread one start execution foo");
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
	  System.out.println("Thread one trying to call b's last()");
	  b.last();
	}
	public synchronized void last(){
		System.out.println("Inside A this is last()");	
	}
}
class B{
	public synchronized void foo(A a){
		System.out.println("Thread two starts execution bar");
		try{
			Thread.sleep(5000);
		}catch(Exception e){}
	  System.out.println("Thread two trying to call b's last()");
	  a.last();
	}
	public synchronized void last(){
		System.out.println("Inside B this is last()");	
	}
	public void bar(A a) {
		// TODO Auto-generated method stub
		
	}
}
public class DeadloakExample extends Thread {
	// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		
		DeadloakExample(){
			this.start();
			a.foo(b);
		}
		public void run(){
			b.bar(a);

	}
	public static void main(String[] args) {
		new DeadloakExample();
}
}
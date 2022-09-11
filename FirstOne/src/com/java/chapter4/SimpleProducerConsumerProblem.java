package com.java.chapter4;

public class SimpleProducerConsumerProblem {
	int n;
	boolean valueSet=false;
	synchronized int get(){
		if(!valueSet){
			try{
				this.wait();
			}catch(InterruptedException e){
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("Got :"+n);
		valueSet=false;
		notify();
		return n;
	}
   synchronized void put(int n){
	   if(valueSet)
		   try{
			   System.out.println("waiting stage thread name"+Thread.currentThread().getName());			   
			   this.wait();
		   }catch(InterruptedException e){
				System.out.println("InterruptedException caught");
			}
	   this.n=n;
	   valueSet=true;
	   System.out.println("Put:"+n);
	   notify();
   }
   //main class
	public static void main(String[] args) {
		SimpleProducerConsumerProblem q=new SimpleProducerConsumerProblem();
		new Producer(q);
		new Consumer(q);
	}
}
class Producer implements Runnable{
	SimpleProducerConsumerProblem q;
	Producer(SimpleProducerConsumerProblem q){
		this.q=q;
		new Thread(this,"Producer").start();		
	}
	@Override
	public void run() {
		int i=0;
		while(i<9){
			q.put(i++);
		}
		}}
class Consumer implements Runnable{
	SimpleProducerConsumerProblem q;
	Consumer(SimpleProducerConsumerProblem q){
		this.q=q;
		new Thread(this,"Consumer").start();		
	}
	public void run() {
		int i=0;
		while(i<9){
			q.get();
		}
		}}


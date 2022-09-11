package com.java.chapter4;

public class TwoThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsumerThread ct=new ConsumerThread();
		ProducerThread pt=new ProducerThread(ct);
		new Thread(ct).start();
		new Thread(pt).start();

	}
}
class ProducerThread implements Runnable{
   ConsumerThread ct;
	public ProducerThread(ConsumerThread ct){
		this.ct=ct;
	}
 	/*once producer start executing run method ,,,First producer
	produce an item and notify to consumer for consuming it*/
	public void run() {
	System.out.println("Producer producing");
	synchronized (ct){
		//here producer notifying consumer for consuming it
		ct.notify();
		System.out.println("notify consumer");
	}
	}	
}
class ConsumerThread implements Runnable{
   //Consumer start first, but it need to wait for producer
	public void run() {
		synchronized (this){			   
				   try{					  			   
					   wait();
				   }catch(Exception e){
						e.printStackTrace();
					}
		}
		System.out.println("Consumer Consuming");
	}}
	

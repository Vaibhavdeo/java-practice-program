package com.practice;

public class ThreadDeadlock extends Thread{
	
	public void run() {
		
		try {
			walk();
		} catch (InterruptedException e1) {		
			e1.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}		
	}	
	public synchronized  void  walk() throws InterruptedException {
		
		run();
		Thread.sleep(1000);
		System.out.println("walk method");
		
	}
	
	public static void main(String[] args) throws Exception {
		
		ThreadDeadlock deadlock = new ThreadDeadlock();
		
		Thread t1= new Thread(deadlock);		
		
		Thread t2 = new Thread(deadlock);
		t1.start();	
		t2.start();
	}
	

}

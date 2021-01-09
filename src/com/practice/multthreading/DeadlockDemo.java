package com.practice.multthreading;

public class DeadlockDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		final String resource1 = "Resource 1";
		
		final String resource2 = "Resource 2";
		
		Thread t1 = new Thread () {
			
			public void run() {
				
				synchronized (resource1) {
					
					System.out.println("Thread 1 lock resource1 " );
					
					try {
						Thread.sleep(1000);										
					} catch (InterruptedException e) {						
						e.printStackTrace();
					} 
					
					synchronized (resource2) {  
			            System.out.println("Thread 1: locked resource 2");  
			           }  
				}
			}
		};
		
		Thread t2 = new Thread () {
			
			public void run() {
				
				synchronized (resource2) {
					
					System.out.println("Thread 2 lock resource2 " );
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					} 
					
					synchronized (resource1) { 
						resource1.notify();
			            System.out.println("Thread 2: locked resource 2");  
			           }  
				}
			}
		};
		
		t1.start();
		t2.start();		
	}

}

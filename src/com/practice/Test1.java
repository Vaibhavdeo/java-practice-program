package com.practice;


public class Test1 {
	
	public void printFibonacci(int n) {
		
		int n1=1, n2=1, fib=0;
		
		if(n==1) {
			System.out.println(1);
		}
		else {
						
			System.out.println(n1 + " " + n2);
			int cnt=0;
			while(cnt<n) {
				fib=n1+n2;
				n1=n2;
				n2=fib;
				System.out.print(fib);
				cnt++;
			}
		}
		
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.printFibonacci(5);
		
	}
}

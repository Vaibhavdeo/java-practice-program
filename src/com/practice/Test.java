package com.practice;


class Parent{
	
	public void run() {
		 walk();
	}
    public void walk() {
    	System.out.println("Parent walk");
	}	
}

class Child extends Parent{
	
	public void run() {
		super.run();
	}
    public void walk() {
    	super.walk();
	}
}

public class Test {
	
public static void main(String[] args) {
	Parent p = new Child();
	p.run();
}
	
}

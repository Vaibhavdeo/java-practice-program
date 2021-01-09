package com.practice.collection;

public class ExecutionClass {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("H1234");
		
		Student s2 = new Student("H1234");
		
		if(s1.equals(s2)) {
			System.out.println("True");
		}
		
		Integer i = new Integer(1);
		
		System.out.println("False" + s1.hashCode()   + " s2 hashcode" + s2.hashCode());
	}

}



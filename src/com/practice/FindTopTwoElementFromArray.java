package com.practice;

public class FindTopTwoElementFromArray {

	public static void main(String[] args) {	
		topTwo(new int[] { 20, 34, 21, 87, 92 });		
	}

	public static void topTwo(int[] numbers) {
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for (int number : numbers) {
			if (number > max1) {
				max2 = max1;
				max1 = number;
			} else if (number > max2) {
				max2 = number;
			}
		}
		 
		System.out.println("Top1: " + max1+ " Top2: " + max2 );
	}

}

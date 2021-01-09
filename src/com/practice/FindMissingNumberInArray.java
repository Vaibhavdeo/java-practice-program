package com.practice;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

		int missingNumber = getMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
		
		System.out.println(missingNumber);			
		
	}

	private static int getMissingNumber(int[] numbers, int totalCount) {
		
		int expectedSum = (totalCount * (totalCount + 1)) / 2;

		int actualSum = 0;

		for (int i : numbers) {
			actualSum += i;

		}

		return expectedSum - actualSum;

	}
}

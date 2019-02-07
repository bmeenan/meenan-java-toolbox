package com.bmeenan.challenge;

import java.util.List;

/**
 * Another challenge given to me in an online test for a position development
 * job. Write a method that returns the greatest possible difference between
 * each element in an array and it's brethren to the left
 * 
 * @see com.bmeenan.challenge.ArrayMaxDifferenceTests for unit tests
 */
public class ArrayMaxDifference {

	public Integer maxDifference(List<Integer> list) {

		Integer[] numberList = new Integer[list.size()];
		numberList = list.toArray(numberList);

		int maxDifference = -1;
		int currentNumber = -1;
		int currentLeft = -1;

		// iterate over the array
		for (int i = 0; i < numberList.length; i++) {
			currentNumber = numberList[i];
			System.out.println("Current number: " + currentNumber);
			// loop to the left and when the is smaller, calculate the difference
			for (int j = i - 1; j >= 0; j--) {
				currentLeft = numberList[j];
				System.out.println("number to the left: " + currentLeft);
				if (currentLeft < currentNumber) {
					maxDifference = Math.max(maxDifference, currentNumber - currentLeft);
					System.out.println("difference is: " + maxDifference);
				}
			}
		}
		return maxDifference;
	}

}

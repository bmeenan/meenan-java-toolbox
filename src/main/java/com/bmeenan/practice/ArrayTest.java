package com.bmeenan.practice;

import java.util.Collections;
import java.util.List;

public class ArrayTest {

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
			// loop to the left and when the left item is smaller than the current number,
			// calculate the difference
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

	public Integer maxDifferenceUsingCollections(List<Integer> list) {
		return Collections.max(list) - Collections.min(list);
	}

	public Integer maxDifferenceBySorting(List<Integer> list) {
		Collections.sort(list);
		return list.get(list.size() - 1) - list.get(0);
	}

	public Integer maxDifferenceManually(List<Integer> list) {
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;

		for (Integer currentNumber : list) {
			min = Math.min(min, currentNumber);
			max = Math.max(max, currentNumber);
		}
		return max - min;
	}
}

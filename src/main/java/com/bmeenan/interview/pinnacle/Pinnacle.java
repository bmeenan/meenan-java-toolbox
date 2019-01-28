package com.bmeenan.interview.pinnacle;

import java.util.Collections;
import java.util.List;

public class Pinnacle {

	public Integer maxDifference(List<Integer> list) {
		if (list.isEmpty()) {
			return 0;
		}
		return Collections.max(list) - Collections.min(list);
	}

	public Integer maxDifferenceAgain(List<Integer> list) {
		if (list.isEmpty()) {
			return 0;
		}
		Collections.sort(list);
		return list.get(list.size() - 1) - list.get(0);
	}

	public Integer maxDifferenceOneMore(List<Integer> list) {
		if (list.isEmpty()) {
			return 0;
		}

		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;

		for (Integer currentNumber : list) {
			min = Math.min(min, currentNumber);
			max = Math.max(max, currentNumber);
		}
		return max - min;
	}

}

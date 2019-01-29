package com.bmeenan.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@Ignore
@RunWith(MockitoJUnitRunner.class)
public class ArrayTests {

	ArrayTest test = new ArrayTest();

	@Ignore
	public void testMaxDifference() {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(7, 2, 3, 10, 2, 4, 8, 1)); // 8
		List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 9, 5, 6, 3, 2)); // 2
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 6, 4)); // 5

		// Integer rtn1 = test.maxDifference(list1);
		Integer rtn2 = test.maxDifference(list2);
		// Integer rtn3 = test.maxDifference(list3);

		// Assert.assertEquals(new Integer(8), rtn1);
		Assert.assertEquals(new Integer(2), rtn2);
		// Assert.assertEquals(new Integer(5), rtn3);

	}
}

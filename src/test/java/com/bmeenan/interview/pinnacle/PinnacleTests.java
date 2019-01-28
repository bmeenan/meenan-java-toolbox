package com.bmeenan.interview.pinnacle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PinnacleTests {

	// https://www.geeksforgeeks.org/maximum-difference-between-two-elements/
	// https://stackoverflow.com/questions/35246177/find-the-max-difference-pair-in-the-array

	Pinnacle pinnacle = new Pinnacle();

	@Test
	public void testMaxDifference() {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 10, 6, 4, 8, 1));
		Integer rtn = pinnacle.maxDifference(list);
		Assert.assertEquals(new Integer(8), rtn);
	}
}

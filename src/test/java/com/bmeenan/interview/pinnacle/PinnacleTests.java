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

	Pinnacle pinnacle = new Pinnacle();

	@Test
	public void testMaxDifference() {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 10, 6, 4, 8, 1));
		Integer rtn = pinnacle.maxDifferenceOneMore(list);
		Assert.assertEquals(new Integer(9), rtn);
	}
}

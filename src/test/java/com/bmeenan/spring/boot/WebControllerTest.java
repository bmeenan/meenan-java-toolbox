package com.bmeenan.spring.boot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WebControllerTest {

	@InjectMocks
	WebController controller;

	@Test
	public void webController_returnsExpectedString() {
		String rtn = controller.index();
		Assert.assertEquals("Welcome to Meenan's Java Toolbox!", rtn);
	}
}

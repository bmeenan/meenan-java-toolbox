package com.mjt.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.mjt.controller.WebController;

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

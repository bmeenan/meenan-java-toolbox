package com.mjt.spring.boot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.mjt.spring.boot.WebController;

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

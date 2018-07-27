package com.bmeenan.games.rps;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RpsControllerTest {

	@Mock
	RpsService service;

	@InjectMocks
	RpsController controller;

	@Test
	public void controller_invokesServiceAndReturnsAString() {
		when(service.shoot()).thenReturn("paper");

		String rtn = controller.shoot();

		assertNotNull(rtn);
		verify(service).shoot();
	}
}

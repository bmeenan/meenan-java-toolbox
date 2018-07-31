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
	public void shoot_invokesServiceAndReturnsAString() {
		when(service.shoot()).thenReturn("paper");

		String rtn = controller.shoot();

		assertNotNull(rtn);
		verify(service).shoot();
	}

	@Test
	public void play_invokesServiceAndReturnsAString() {
		when(service.play("rock")).thenReturn("game result.");

		String rtn = controller.play("rock");

		assertNotNull(rtn);
		verify(service).play("rock");
	}

}

package com.bmeenan.games.rps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RpsServiceTest {

	@InjectMocks
	RpsService service;

	@Test
	public void getChoices_returnsAllowableOptionsForGame() {
		List<String> choices = service.getChoices();
		assertNotNull(choices);
		assertFalse(choices.isEmpty());
		assertTrue(choices.contains("rock"));
		assertTrue(choices.contains("paper"));
		assertTrue(choices.contains("scissors"));
	}

	@Test
	public void shoot_alwaysReturnsAnAllowableValue() {
		String returnedValue = service.shoot();
		assertTrue(service.getChoices().contains(returnedValue));
	}
}

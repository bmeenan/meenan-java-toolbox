package com.bmeenan.games.rps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import javax.validation.ValidationException;

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
		List<String> choices = RpsChoices.asListOfStrings();
		assertNotNull(choices);
		assertFalse(choices.isEmpty());
		assertTrue(choices.contains("rock"));
		assertTrue(choices.contains("paper"));
		assertTrue(choices.contains("scissors"));
	}

	@Test
	public void shoot_alwaysReturnsAnAllowableValue() {
		String returnedValue = service.shoot();
		assertTrue(RpsChoices.asListOfStrings().contains(returnedValue));
	}

	@Test
	public void shoot_withInvalidOption_throwsValidationException() {
		try {
			service.play("hulk smash");
			fail();
		} catch (Exception e) {
			assertTrue(e instanceof ValidationException);
			assertEquals(
					"hulk smash is not a valid option. Please select either rock, paper, or scissors and try again.",
					e.getMessage());
		}
	}
}

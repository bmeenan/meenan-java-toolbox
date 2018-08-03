package com.bmeenan.games.rps;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RpsShooterTest {

	@InjectMocks
	RpsShooter shooter;

	@Test
	public void shoot_alwaysReturnsAnAllowableValue() {
		String returnedValue = shooter.shoot();
		assertTrue(RpsChoices.asListOfStrings().contains(returnedValue));
	}
}

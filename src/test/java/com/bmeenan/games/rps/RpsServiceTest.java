package com.bmeenan.games.rps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import javax.validation.ValidationException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RpsServiceTest {

	@Mock
	RpsShooter shooter;
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
	public void play_withInvalidOption_throwsValidationException() {
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

	@Test
	public void shoot_returnsStringAndCallsShooter() {
		when(shooter.shoot()).thenReturn("rock");
		assertNotNull(service.shoot());
		verify(shooter).shoot();
	}

	@Test
	public void play_playerRock_gameRock_draw() {
		when(shooter.shoot()).thenReturn("rock");
		String rtn = service.play("rock");
		assertEquals("You threw rock. Game threw rock. Draw!", rtn);
	}

	@Test
	public void play_playerRock_gamePaper_playerLoses() {
		when(shooter.shoot()).thenReturn("paper");
		String rtn = service.play("rock");
		assertEquals("You threw rock. Game threw paper. Player loses!", rtn);
	}

	@Test
	public void play_playerRock_gameScissors_playerWins() {
		when(shooter.shoot()).thenReturn("scissors");
		String rtn = service.play("rock");
		assertEquals("You threw rock. Game threw scissors. Player wins!", rtn);
	}

	@Test
	public void play_playerPaper_gamePaper_draw() {
		when(shooter.shoot()).thenReturn("paper");
		String rtn = service.play("paper");
		assertEquals("You threw paper. Game threw paper. Draw!", rtn);
	}

	@Test
	public void play_playerPaper_gameRock_playerWins() {
		when(shooter.shoot()).thenReturn("rock");
		String rtn = service.play("paper");
		assertEquals("You threw paper. Game threw rock. Player wins!", rtn);
	}

	@Test
	public void play_playerPaper_gameScissors_playerLoses() {
		when(shooter.shoot()).thenReturn("scissors");
		String rtn = service.play("paper");
		assertEquals("You threw paper. Game threw scissors. Player loses!", rtn);
	}

	@Test
	public void play_playerScissors_gameScissor_draw() {
		when(shooter.shoot()).thenReturn("scissors");
		String rtn = service.play("scissors");
		assertEquals("You threw scissors. Game threw scissors. Draw!", rtn);
	}

	@Test
	public void play_playerScissors_gameRock_playerLoses() {
		when(shooter.shoot()).thenReturn("rock");
		String rtn = service.play("scissors");
		assertEquals("You threw scissors. Game threw rock. Player loses!", rtn);
	}

	@Test
	public void play_playerScissors_gamePaper_playerWins() {
		when(shooter.shoot()).thenReturn("paper");
		String rtn = service.play("scissors");
		assertEquals("You threw scissors. Game threw paper. Player wins!", rtn);
	}

}

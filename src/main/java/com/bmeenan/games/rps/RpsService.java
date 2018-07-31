package com.bmeenan.games.rps;

import java.util.List;
import java.util.Random;

import javax.validation.ValidationException;

import org.springframework.stereotype.Service;

@Service
public class RpsService {

	public String shoot() {
		Random randomizer = new Random();
		List<String> choices = RpsChoices.asListOfStrings();
		return choices.get(randomizer.nextInt(choices.size()));
	}

	public String play(String playerChoice) {
		// validate the players choice
		assertChoice(playerChoice);
		// have the game pick it's choice
		String gameChoice = this.shoot();
		// determine who wins
		return play(RpsChoices.fromString(playerChoice), RpsChoices.fromString(gameChoice));
	}

	private void assertChoice(String choice) {
		if (!RpsChoices.contains(choice)) {
			throw new ValidationException(
					choice + " is not a valid option. Please select either rock, paper, or scissors and try again.");
		}
	}

	private String play(RpsChoices playerChoice, RpsChoices gameChoice) {
		/*
		 * rock beats scissors paper beats rock scissors beats paper
		 */

		boolean playerWins = false;

		switch (playerChoice) {
		case rock:
			if (gameChoice.equals(RpsChoices.scissors)) {
				playerWins = true;
			}
			break;

		case paper:
			if (gameChoice.equals(RpsChoices.rock)) {
				playerWins = true;
			}
			break;

		case scissors:
			if (gameChoice.equals(RpsChoices.paper)) {
				playerWins = true;
			}
			break;
		}

		String result = "You threw " + playerChoice.toString() + ". Game threw " + gameChoice.toString() + ". ";
		if (playerWins) {
			result = "Player wins!";
		} else {
			result = "Player loses!";
		}
		return result;
	}

}

package com.bmeenan.games.rps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RpsService {

	private static List<String> choices;

	public String shoot() {
		Random randomizer = new Random();
		List<String> choices = this.getChoices();
		return choices.get(randomizer.nextInt(choices.size()));
	}

	public List<String> getChoices() {
		if (Objects.isNull(choices)) {
			choices = new ArrayList<>(Arrays.asList("rock", "paper", "scissors"));
		}
		return choices;
	}
}

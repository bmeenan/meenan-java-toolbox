package com.bmeenan.games.rps;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RpsService {

	public String shoot() {
		Random randomizer = new Random();
		List<String> choices = RpsChoices.asListOfStrings();
		return choices.get(randomizer.nextInt(choices.size()));
	}
}

package com.bmeenan.games.rps;

import java.util.ArrayList;
import java.util.List;

public enum RpsChoices {
	rock, paper, scissors;

	public static List<String> asListOfStrings() {
		List<String> list = new ArrayList<>();
		for (RpsChoices choice : RpsChoices.values()) {
			list.add(choice.toString());
		}
		return list;
	}

	public static boolean contains(String str) {
		for (RpsChoices choice : RpsChoices.values()) {
			if (choice.name().equals(str)) {
				return true;
			}
		}
		return false;
	}

}

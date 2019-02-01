package com.bmeenan.interview;

import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(String stringOne, String stringTwo) {

		// convert to char array
		char[] lettersOne = stringOne.toCharArray();
		char[] lettersTwo = stringTwo.toCharArray();

		// sort both arrays
		Arrays.sort(lettersOne);
		Arrays.sort(lettersTwo);

		// now fail fast
		if (lettersOne.length != lettersTwo.length) {
			return false;
		}
		for (int i = 0; i < lettersOne.length; i++) {
			if (lettersOne[i] != lettersTwo[i]) {
				return false;
			}
		}
		// if we made it here, it's a match
		return true;
	}
}

package com.bmeenan.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

/**
 * This was a challenge posed to me an interview for a Java dev position.
 * 
 * Write a method where 2 strings are provided and it returns true if it's an
 * anagram.
 * 
 * Examples: pool and polo return true. pool and poll return false. pools and
 * polo return false.
 * 
 * There are two implementations here. isAnagramBySorting was the initial
 * attempt and later replaced with isAnagramByMapping to address performance
 * concerns.
 * 
 * See com.bmeenan.challenge.AnagramTests in this project for unit testing.
 * 
 */
public class Anagram {

	public boolean isAnagram(String wordOne, String wordTwo) {

		// if either are empty (null or "", throw an exception)
		if (StringUtils.isEmpty(wordOne) || StringUtils.isEmpty(wordTwo)) {
			throw new IllegalArgumentException("Both parameters must be valued and not blank.");
		}
		// return false if the words are different lengths
		if (wordOne.length() != wordTwo.length()) {
			return false;
		}

		// return isAnagramBySorting(wordOne, wordTwo);
		return isAnagramByMapping(wordOne, wordTwo);

	}

	// initial implementation
	private boolean isAnagramBySorting(String wordOne, String wordTwo) {

		// convert to char array
		char[] lettersOne = wordOne.toCharArray();
		char[] lettersTwo = wordTwo.toCharArray();

		// sort both arrays
		Arrays.sort(lettersOne);
		Arrays.sort(lettersTwo);

		// compare the arrays char by char and fail if a mismatch is found
		for (int i = 0; i < lettersOne.length; i++) {
			if (lettersOne[i] != lettersTwo[i]) {
				return false;
			}
		}
		// if we made it here, it's a match
		return true;
	}

	// to address performance concerns with Arrays.sort in isAnagramBySorting...
	private boolean isAnagramByMapping(String wordOne, String wordTwo) {

		// we have matching lengths - map the words and compare
		Map<Character, Integer> wordOneMap = mapWord(wordOne);
		Map<Character, Integer> wordTwoMap = mapWord(wordTwo);

		return wordOneMap.equals(wordTwoMap);

	}

	private Map<Character, Integer> mapWord(String word) {
		Map<Character, Integer> wordMap = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (wordMap.containsKey(letter)) {
				int existingCount = wordMap.get(letter);
				wordMap.put(letter, existingCount++);
			} else {
				wordMap.put(letter, 1);
			}
		}
		return wordMap;
	}
}

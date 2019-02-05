package com.bmeenan.practice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

public class Anagram {

	public boolean isAnagram(String wordOne, String wordTwo) {

		// if either are empty (null or "", return false)
		if (StringUtils.isEmpty(wordOne) || StringUtils.isEmpty(wordTwo)) {
			return false;
		}

		// return false if the words are different lengths
		if (wordOne.length() != wordTwo.length()) {
			return false;
		}

		// we have matching lengths - map the words and compare
		Map<Character, Integer> wordOneMap = mapWord(wordOne);
		Map<Character, Integer> wordTwoMap = mapWord(wordTwo);

		return wordOneMap.equals(wordTwoMap);
	}

	public Map<Character, Integer> mapWord(String word) {
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

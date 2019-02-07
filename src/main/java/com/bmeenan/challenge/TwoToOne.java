package com.bmeenan.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem: https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
 */

public class TwoToOne {

	public static String longest(String s1, String s2) {

		Set<Character> characters = new HashSet<>();
		characters = addStringToSet(s1, characters);
		characters = addStringToSet(s2, characters);

		List<Character> sortedList = new ArrayList<>(characters);
		Collections.sort(sortedList);

		return listOfCharsToString(sortedList);
	}

	private static Set<Character> addStringToSet(String string, Set<Character> set) {
		for (int i = 0; i < string.length(); i++) {
			set.add(string.charAt(i));
		}
		return set;
	}

	private static String listOfCharsToString(List<Character> list) {
		String rtn = "";
		for (Character character : list) {
			rtn += character;
		}
		return rtn;
	}
}

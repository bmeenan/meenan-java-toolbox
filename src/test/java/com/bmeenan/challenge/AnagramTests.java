package com.bmeenan.challenge;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnagramTests {

	Anagram anagram = new Anagram();

	@Test
	public void whenWordsMatch_returnsTrue() {
		assertTrue(anagram.isAnagram("pool", "polo"));
	}

	@Test
	public void whenWordsNoNotMatchButHaveTheSameNumberOfCharacters_returnsFalse() {
		assertFalse(anagram.isAnagram("pool", "lake"));
	}

	@Test
	public void whenWordsDoNotMatch_returnsFalse() {
		assertFalse(anagram.isAnagram("pools", "polo"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenOneWordIsEmpty_throwsIllegalArgumentException() {
		anagram.isAnagram("", "polo");
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenBothWordsAreEmptyOrNull_throwsIllegalArgumentException() {
		anagram.isAnagram("", null);
	}

}

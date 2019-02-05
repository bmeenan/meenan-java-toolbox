package com.bmeenan.practice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.bmeenan.practice.Anagram;

@RunWith(MockitoJUnitRunner.class)
public class AnagramTests {

	Anagram anagram = new Anagram();

	@Test
	public void whenWordsMatch_returnsTrue() {
		assertTrue(anagram.isAnagram("pool", "polo"));
	}

	@Test
	public void whenWordsNoNotMatchButHaveTheSameNumberOfCharacters_returnsTrue() {
		assertFalse(anagram.isAnagram("pool", "lake"));
	}

	@Test
	public void whenWordsDoNotMatch_returnsFalse() {
		assertFalse(anagram.isAnagram("pools", "polo"));
	}

	@Test
	public void whenOneWordIsEmpty_returnsFalse() {
		assertFalse(anagram.isAnagram("", "polo"));
	}

	@Test
	public void whenBothWordsAreEmptyOrNull_returnsFalse() {
		assertFalse(anagram.isAnagram("", null));
	}

}

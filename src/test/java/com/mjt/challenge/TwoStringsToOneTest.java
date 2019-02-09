package com.mjt.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mjt.challenge.TwoStringsToOne;

public class TwoStringsToOneTest {

	@Test
	public void test() {
		assertEquals("aehrsty", TwoStringsToOne.combineStrings("aretheyhere", "yestheyarehere"));
		assertEquals("abcdefghilnoprstu", TwoStringsToOne.combineStrings("loopingisfunbutdangerous", "lessdangerousthancoding"));
		assertEquals("acefghilmnoprstuy", TwoStringsToOne.combineStrings("inmanylanguages", "theresapairoffunctions"));
	}

}

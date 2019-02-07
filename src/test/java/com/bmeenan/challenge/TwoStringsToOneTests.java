package com.bmeenan.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoStringsToOneTests {

	@Test
	public void test() {
		assertEquals("aehrsty", TwoStringsToOne.combineStrings("aretheyhere", "yestheyarehere"));
		assertEquals("abcdefghilnoprstu", TwoStringsToOne.combineStrings("loopingisfunbutdangerous", "lessdangerousthancoding"));
		assertEquals("acefghilmnoprstuy", TwoStringsToOne.combineStrings("inmanylanguages", "theresapairoffunctions"));
	}

}

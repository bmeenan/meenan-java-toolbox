package com.bmeenan.games.rps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RpsChoicesTest {

	@Test
	public void contains_withValidValue_returnTrue() {
		assertTrue(RpsChoices.contains("rock"));
	}

	@Test
	public void contains_withInvalidValue_returnFalse() {
		assertFalse(RpsChoices.contains("hulk smash"));
	}

	@Test
	public void asListOfStrings_returnsListOfStringsWithExpectedValues() {
		List<String> list = RpsChoices.asListOfStrings();
		assertNotNull(list);
		assertEquals(3, list.size());
		assertTrue(list.contains("rock"));
		assertTrue(list.contains("paper"));
		assertTrue(list.contains("scissors"));
	}

}

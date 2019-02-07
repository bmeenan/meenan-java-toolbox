package com.mjt.json;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(MockitoJUnitRunner.class)
public class JsonMarshallingTests {

	String JSON_STRING = "{\"stringFieldName\":\"string value\",\"integerFieldName\":1310,\"dateFieldName\":1546300800}";

	@Test
	public void pojoToJson() throws JsonProcessingException {
		// create the object in code
		SomePojo pojo = new SomePojo();
		pojo.setStringAttribute("string value");
		pojo.setIntegerAttribute(Integer.valueOf(1310));

		// set date to an expected value so we can compare the result
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(1546300800);
		pojo.setDateAttribute(cal.getTime());

		// serialize
		ObjectMapper mapper = new ObjectMapper();
		String jsonOutput = mapper.writeValueAsString(pojo);

		assertEquals(JSON_STRING, jsonOutput);
	}

	@Test
	public void jsonToPojo() throws JsonParseException, JsonMappingException, IOException {
		// serialize
		ObjectMapper mapper = new ObjectMapper();
		SomePojo pojo = mapper.readValue(JSON_STRING, SomePojo.class);

		// assert expected values
		assertEquals("string value", pojo.getStringAttribute());
		assertEquals(Integer.valueOf(1310), pojo.getIntegerAttribute());
		assertEquals(1546300800, pojo.getDateAttribute().getTime());
	}

}
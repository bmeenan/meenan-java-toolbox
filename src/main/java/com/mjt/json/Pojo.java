package com.mjt.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a plain old java object used to demonstrate Jackson's FasterXML
 * serializing and de-serializing capabilities.
 * 
 * @see com.mjt.json.JsonMarshallingTest for examples of how it's used
 */

public class Pojo {

	@JsonProperty("stringFieldName")
	private String stringAttribute;

	@JsonProperty("integerFieldName")
	private Integer integerAttribute;

	@JsonProperty("dateFieldName")
	private Date dateAttribute;

	public String getStringAttribute() {
		return stringAttribute;
	}

	public void setStringAttribute(String stringAttribute) {
		this.stringAttribute = stringAttribute;
	}

	public Integer getIntegerAttribute() {
		return integerAttribute;
	}

	public void setIntegerAttribute(Integer integerAttribute) {
		this.integerAttribute = integerAttribute;
	}

	public Date getDateAttribute() {
		return dateAttribute;
	}

	public void setDateAttribute(Date dateAttribute) {
		this.dateAttribute = dateAttribute;
	}
}

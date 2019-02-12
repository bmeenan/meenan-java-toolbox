package com.mjt.configuration;

import java.util.Map;

public class ObjectWithProperties {

	private String stringProperty;
	private Map<String, AnotherObjectWithProperties> mapProperty;

	public String getStringProperty() {
		return stringProperty;
	}

	public void setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
	}

	public Map<String, AnotherObjectWithProperties> getMapProperty() {
		return mapProperty;
	}

	public void setMapProperty(Map<String, AnotherObjectWithProperties> mapProperty) {
		this.mapProperty = mapProperty;
	}

}

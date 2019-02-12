package com.mjt.configuration;

import java.util.HashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yaml")
@ConfigurationProperties
public class ComplexConfig {

	private HashMap<String, ObjectWithProperties> mapOfObjects = new HashMap<>();

	public HashMap<String, ObjectWithProperties> getMapOfObjects() {
		return mapOfObjects;
	}

	public void setMapOfObjects(HashMap<String, ObjectWithProperties> mapOfObjects) {
		this.mapOfObjects = mapOfObjects;
	}

}

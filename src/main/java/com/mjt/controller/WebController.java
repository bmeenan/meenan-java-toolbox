package com.mjt.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mjt.configuration.ComplexConfig;
import com.mjt.configuration.ObjectWithProperties;

@RestController
public class WebController {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebController.class);

	@Autowired
	ComplexConfig config;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		LOGGER.info("Endpoint called. Returning welcome message.");
		return "Welcome to Meenan's Java Toolbox!";
	}

	@RequestMapping(value = "/complexconfig", method = RequestMethod.GET)
	public Map<String, ObjectWithProperties> getConfig() {
		HashMap<String, ObjectWithProperties> map = config.getMapOfObjects();
		return map;
	}

}

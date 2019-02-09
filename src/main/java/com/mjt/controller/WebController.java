package com.mjt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		LOGGER.info("Endpoint called. Returning welcome message.");
		return "Welcome to Meenan's Java Toolbox!";
	}

}

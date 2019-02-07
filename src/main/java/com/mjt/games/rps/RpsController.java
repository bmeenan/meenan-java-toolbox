package com.mjt.games.rps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RpsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RpsController.class);

	@Autowired
	RpsService service;

	@RequestMapping(value = "/rps/shoot", method = RequestMethod.GET)
	public String shoot() {
		LOGGER.info("Rock, paper, scissors... shoot!");
		return service.shoot();
	}

	@RequestMapping(value = "/rps/play/{choice}", method = RequestMethod.POST)
	public String play(@PathVariable("choice") String choice) {
		return service.play(choice);
	}

}

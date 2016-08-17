package com.unsis.clinic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	public String Employee445() {
		logger.info("Bienvenido return index.");
		return "index";
	}
}

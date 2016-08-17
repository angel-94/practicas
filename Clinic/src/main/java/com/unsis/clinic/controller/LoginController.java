package com.unsis.clinic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.unsis.clinic.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("Welcome home!}.");
		return "index";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView loginUser(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter("userName");
		String password = request.getParameter("userName");

		logger.info("nombre de usuario", name);

		userService.getLogin(name, password);

		logger.info("en el metodo del login en el homeController con post");

		ModelAndView model = null;

		model = new ModelAndView("login");

		return model;
	}

}

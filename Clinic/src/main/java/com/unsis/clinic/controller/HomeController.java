package com.unsis.clinic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.unsis.clinic.model.User;
//import com.unsis.clinic.model.User;
import com.unsis.clinic.service.UserService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("Welcome home!}.");
		return "index";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView loginUser() {
		logger.info("en el metodo del login en el homeController con post");
		
		/*if (user != null){
			logger.info("nombre en el homeController: ", user.getUserName());
			userService.getLogin(user);
		}*/
		//Aquí validaremos los datos del usuario y crearemos su sesión.
		ModelAndView model= null;

		model = new ModelAndView("login");

//		logger.info("nombre de usaurio en el controller: ", userName);
		
		return model;
	}
	
}

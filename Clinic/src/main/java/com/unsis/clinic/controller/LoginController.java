package com.unsis.clinic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

import com.unsis.clinic.model.User;
import com.unsis.clinic.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("Bienvenido return index.");
		return "index";
	}

	/**
	 * 
	 * @param userName nombre de usuario de la aplicación
	 * @param password contraseña de usuario de la aplicación
	 * @return la página según el usuario logeado (Administrador, Médico o enfermera).
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestParam ("userName") String userName, @RequestParam("password") String password) {
		logger.info("En el controlador del loginUser");
		logger.info(userName);
		logger.info(password);
		String pag = null;
//		ModelAndView modelAndView = new ModelAndView("login");
		User user = new User();
		if(userName != null && password != null){
			user = userService.getLogin(userName, password);
			if(user != null){
				pag = "menu";
//				return modelAndView.addObject("carList", userService.getUserById(user.getUserId()));
			}
		}
		return pag;
	}

}

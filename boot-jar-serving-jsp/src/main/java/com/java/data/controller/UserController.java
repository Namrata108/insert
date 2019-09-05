package com.java.data.controller;

import com.java.data.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.data.model.User;

@Controller
public class UserController {

	@Autowired
	UserServices userServices;
	


	@RequestMapping(value = "/addNewUser", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("addNewUser", "user", new User());
	}

	@RequestMapping(value = "/addNewUser", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("user") User user) {
		userServices.insertuser(user);
		ModelAndView model = new ModelAndView("success");
		model.addObject("User", user);
		return model;
	}
}

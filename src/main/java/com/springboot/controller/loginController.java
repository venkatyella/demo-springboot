package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.service.Loginservice;



@Controller
@SessionAttributes("name")
public class loginController {
	
	@Autowired
	Loginservice service;
	
	@RequestMapping(value ="/login",method = RequestMethod.GET)
	public String ShowLoginPage(ModelMap model) {
		//model.put("name", hello);
		return "login";
	} 
	@RequestMapping(value ="/login",method = RequestMethod.POST)
	public String ShowMainPage(ModelMap model,@RequestParam String loginid,@RequestParam String password) {
		boolean isValid = service.validate(loginid, password);
		if(!isValid) {
			model.put("invalid","invalid credentials");
			return "login";
		}
		model.put("name", loginid);
		return "welcome";
	} 
	}

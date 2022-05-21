package com.springboot.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Loginservice {
	public boolean validate(String userid, String password) {
		 return userid.equalsIgnoreCase("venkat") 
				 && password.equalsIgnoreCase("ramana");
		
	}
}

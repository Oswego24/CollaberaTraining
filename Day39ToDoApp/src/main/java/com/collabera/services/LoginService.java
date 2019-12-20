package com.collabera.services;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public Boolean validateUser(String name, String password) {
		return name.equalsIgnoreCase("Oscar") && password.equalsIgnoreCase("123");
	}
}

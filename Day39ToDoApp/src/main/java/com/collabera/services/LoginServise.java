package com.collabera.services;

import org.springframework.stereotype.Service;

@Service
public class LoginServise {
	
	public Boolean validateUser(String name, String password) {

		return name.equalsIgnoreCase("Oscar") && password.equalsIgnoreCase("123");
	}

}

package com.collabera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@EnableAuthorizationServer
//@EnableGlobalMethod
@SpringBootApplication
public class Day41BankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day41BankAppApplication.class, args);
	}

}

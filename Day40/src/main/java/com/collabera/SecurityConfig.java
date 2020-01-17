package com.collabera;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurationAdapter {
	
	@Value(value = "${user1}")
	private String user1;
	@Value(value = "${user2}")
	private String user2;
	@Value(value = "${user3}")
	private String user3;
}

package com.collabera;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Value(value = "${user1}")
	private String user1;
	@Value(value = "${user2}")
	private String user2;
	@Value(value = "${user3}")
	private String user3;
	
	@Value(value = "${pass1}")
	private String pass1;
	@Value(value = "${pass2}")
	private String pass2;
	@Value(value = "${pass3}")
	private String pass3;
	
	@Value(value = "${role1}")
	private String role1;
	@Value(value = "${role2}")
	private String role2;
	@Value(value = "${role3}")
	private String role3;
	
	@Override
		protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/profile").authenticated()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/manager").hasAnyRole("ADMIN","MANAGER")
		.and()
		.httpBasic();
	}
	
	@Override 
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		UserBuilder users = User.builder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username(user1).password(passwordEncoder().encode(pass1)).roles(role1))
			.withUser(users.username(user2).password(passwordEncoder().encode(pass2)).roles(role2))
			.withUser(users.username(user3).password(passwordEncoder().encode(pass3)).roles(role3));
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}

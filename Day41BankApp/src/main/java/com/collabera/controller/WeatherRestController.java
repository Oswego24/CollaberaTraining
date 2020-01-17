package com.collabera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {
	//expose "/Bankingapp" endpoint and giving specific access
	@GetMapping("/")
	public String welcomePage() {
		return "Welcome to Bank of America";
	}
	
	@GetMapping("/profile")
	public String getProfile() {
		return "Profile Page";
	}
	
	@GetMapping("/admin")
	public String getAdminPage() {
		return "Admin Page";
	}
	
	@GetMapping("/manager")
	public String getManagementPage() {
		return "Managenment Page";
	}
//	@Value("${weatherApiKey}")
//	private String weatherApiKey;
//	
//	//Retrieving these values from application.properites
//	@Value("${coach.name}")
//	private String coachName;
//	
//	@Value("${team.name}")
//	private String teamName;
//	
//	//Expose new endpoint for teaminfo
//	@GetMapping("/teaminfo")
//	public String getTeamInfo() {
//		return "Coach: " + coachName + " Team Name: " + teamName;
//	}
//	
//	@GetMapping("/city")
//	public Object getWeatherApi(@PathVariable("city") String city) {
//		RestTemplate restTemplate = new RestTemplate();
//		
//		String uri = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=" + weatherApiKey;
//		Object result = restTemplate.getForObject(uri, Object.class);
//		return result;
//	}
}

package com.collabera.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller("error")
public class ErrorController {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView errorHandler(HttpServletRequest request, Exception ex) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("Exception", ex.getStackTrace());
		mav.addObject("Url", request.getRequestURL());
		mav.setViewName("error");
		
		return mav;
	}
}

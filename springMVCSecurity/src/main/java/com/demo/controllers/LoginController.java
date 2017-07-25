package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping (value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		
		System.out.println("Login handler running,");
		
		String randomMessageOfTheDay = "Keep your head up!";
		
		model.addAttribute("randomMessageOfTheDay", randomMessageOfTheDay);
		
		return ("login");
	} // public String login(Model model) {
	
	@RequestMapping (value="/loginFail", method=RequestMethod.GET)
	public String loginFail (Model model) {
		
		System.out.println ("Login fail handler running.");
		
		model.addAttribute("errorMessage", "Opps, there was a problem loggin in.");
		
		return ("login");
	} // public String loginFail (Model model) {

} // public class LoginController {

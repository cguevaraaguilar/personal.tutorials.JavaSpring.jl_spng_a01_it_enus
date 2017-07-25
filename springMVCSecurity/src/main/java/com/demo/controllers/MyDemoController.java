package com.demo.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyDemoController {
	
	private String [] quotes = {
			"To be or not to be.",
			"Spring is nature's way of waying 'Let's Party'.",
			"The thime is always right to what is right."
	} ;

	// http://localhost:8080/springMVCDemo/getQuote.html
	
	@RequestMapping(value="/getQuote")
	public String getRandomQuote (Model model) {
		int rand = new Random().nextInt(quotes.length);
		
		System.out.println("URL Mapped Successfully.");
		
		String randomQuote = quotes [rand];
		
		model.addAttribute("randomQuote", randomQuote);
		
		return ("quote");
	} // public String getRandomQuote (Model model) {
	
	@RequestMapping(value="/home")
	public String getHome (Model model) {
		return ("home");
	} // public String getHome (Model model) {
	
} // public class MyDemoController {

package com.demo.controllers;

import java.io.FileOutputStream;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.demo.model.Account;


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
		
		String randomQuote = quotes [rand];
		
		model.addAttribute("randomQuote", randomQuote);
		
		return ("quote");
	} // public String getRandomQuote (Model model) {
	
	@ModelAttribute
	public void setUserDettails (@RequestParam ("userName") String userName, Model model) {
		
		model.addAttribute("userName", userName);
		
		String userRole = "undefined";
		
		if (userName.equals("Carlos")) {
			userRole = "Student";			
		} else if (userName.equals("John")) {
			userRole = "Teacher";
		} else if (userName.equals("Allana")) {
			userRole = "Dean";
		}
		
		model.addAttribute("userRole", userRole);
		
		System.out.println("Model updated with user information.");
	} // public void setUserDettails (@RequestParam ("userName") String userName, Model model) {
	
	@RequestMapping(value="/createAccount")
	public String createAccount (@Valid @ModelAttribute ("aNewAccount") Account account, BindingResult result) {
		
		if (result.hasErrors()){
	
			System.out.println("Form has errors");
			return ("createAccount");
		} // if (result.hasErrors()){
		
		System.out.println("Form validated");
		System.out.println("Create account " + account.getFirstName() + " " + account.getLastName() + " " + account.getAge() + " " + account.getAddress() + " " + account.getEmail());
		
		// model.addAllAttributes(attributeValues)
		
		return ("accountCreated");
	} // public String createAccount (@Valid @ModelAttribute ("aNewAccount") Account account, BindingResult result) {
	
	@RequestMapping(value="/doCreate")
	public String doCreate (@ModelAttribute ("aNewAccount") Account account) {
		
		System.out.println("Do create " + account.getFirstName() + " " + account.getLastName() + " " + account.getAge() + " " + account.getAddress() + " " + account.getEmail());
		
		return ("redirect:accConfirm");
	} // public String doCreate (@@ModelAttribute ("aNewAccount") Account account) {
	
	@RequestMapping(value="/accConfirm")
	public String accountConfirmation (@ModelAttribute ("aNewAccount") Account account) {
		
		System.out.println("Account Confirmation " + account.getFirstName() + " " + account.getLastName() + " " + account.getAge() + " " + account.getAddress() + " " + account.getEmail());
		
		return ("accountConfirmed");
	} // public String accountConfirmation (@ModelAttribute ("aNewAccount") Account account) {
	
	@RequestMapping(value="/accountCreated", method=RequestMethod.POST)
	public String performCreate (Account account) {
		
		System.out.println(account.getFirstName() + " " + account.getLastName() + " " + account.getAge() + " " + account.getAddress() + " " + account.getEmail());
		
		return ("accountCreated");
	} // public String performCreate (Account account) {
		
	@RequestMapping (value="/myForm")
	public String myForm () {
		
		return ("myForm");
	} // public String myForm () {
	
	@RequestMapping(value="/handleForm")
	public String handleForm (@RequestParam("file") MultipartFile file) {
		
		try {
			
			if (!file.isEmpty()) {
				
				byte [] bytes = file.getBytes ();
				FileOutputStream fos = new FileOutputStream ("F:\\Temp\\file");
				fos.write(bytes);
				fos.close();
				System.out.println("File saved successfully");
			}
		} catch (Exception e) {
			System.out.println("Error saving file. " + e.getMessage());
		}
		
		return ("oprationComplete");
	} // public String handleForm (@RequestParam("file") MultipartFile file) {
	 
} // public class MyDemoController {

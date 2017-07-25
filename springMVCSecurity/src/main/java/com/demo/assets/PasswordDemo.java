package com.demo.assets;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordDemo {

	public String getMD5Hash (String plainText) {
		
		Md5PasswordEncoder encoder = new Md5PasswordEncoder ();
		
		String encrypted = encoder.encodePassword(plainText, null);
		
		System.out.println("Password encrypted usind MD5 = " + encrypted);
		
		return (encrypted);
	} // public String getMD5Hash (String plainText) {
	
	public String getBcryptHash (String plainText) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder ();
		
		String encrypted = encoder.encode(plainText);
		
		System.out.println("Password encrypted usind Bcrypt = " + encrypted);
		
		return (encrypted);
	} // public String getBcryptHash (String plainText) {
	
} // public class PasswordDemo {

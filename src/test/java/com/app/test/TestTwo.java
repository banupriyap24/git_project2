package com.app.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTwo {
	
	public static void main(String[] args) {
		
		// validate the email and that allows sub domain in reg ex
		String s = "[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern pat = Pattern.compile(s);
		String email [] = {"user2@test.ceretreom","user1_one.com","user1@two.com"};
		for (String x : email) {
			Matcher matcher = pat.matcher(x);
			System.out.println(x +" "+ matcher.matches());
		}
		
		
		
		
	}

}

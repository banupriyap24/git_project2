package com.app.junit;

import org.junit.Ignore;
import org.junit.Test;

public class Pri_order {
	@Test
	public void user() {
		System.out.println("user");
	}
	
	
	@Ignore
	@Test
	public void password() {
		System.out.println("password");
	}
	
	@Test
	public void login() {
		System.out.println("login");
	}
	
	
	
	
}

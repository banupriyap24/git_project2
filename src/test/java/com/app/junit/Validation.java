package com.app.junit;

import org.junit.Assert;
import org.junit.Test;

public class Validation {
	
	@Test
	public void test1() {
		String s = "Aiite";
		//== .equals()
		//s.contentEquals(s)e
		//expected actual 
		Assert.assertTrue(s.contains("A"));
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		String s = "Aiite";
		//== .equals()
		//s.contentEquals(s)e
		//expected actual 
		Assert.assertEquals(s, "Aii");
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		String s = "Aiite";
		//== .equals()
		//s.contentEquals(s)e
		//expected actual 
		Assert.assertFalse(s.contains("a"));
		System.out.println("test3");
	}

	
}

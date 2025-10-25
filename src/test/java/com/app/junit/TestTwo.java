package com.app.junit;

import org.junit.Ignore;
import org.junit.Test;

public class TestTwo {
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	
	@Ignore
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
}

package com.app.junit;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleAnnotation {

	@BeforeClass
	public static void beforeclass() {
		System.out.println("beforeclass");
	}

	@AfterClass
	public static void afterclass() {
		System.out.println("afterclass");
	}

	@Before
	public void before() {
		Date d = new Date();
				System.out.println(d);
		System.out.println("before");
	}

	@After
	public void after() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("after");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}

}

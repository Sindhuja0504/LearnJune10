package com.org.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class First {
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
     @After
	public void after() {
		System.out.println("after");
	}
    @Before
	public void before() {
		System.out.println("before");
	}
    @Test
	public void test() {
		System.out.println("test");
	}
    @BeforeClass
	public static void beforeClass() {
		System.out.println("beforeclass");
	}

}

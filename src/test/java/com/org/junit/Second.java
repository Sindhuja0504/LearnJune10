package com.org.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Second {

	@BeforeClass
	public static void url() {
		System.out.println("load url");
	}

	@Test
	public void name() {
		System.out.println("username");

	}
	@Test
	
	public void newpass() {
		System.out.println("new password");

	}

	@Test
	public void confirmpass() {
		System.out.println("confirm password");

	}

	@After
	public  void after() {
		System.out.println("login");
	}

	@AfterClass
	public static void report() {
		System.out.println("report");
	}

}

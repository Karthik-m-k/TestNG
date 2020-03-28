package com.testNG_GroupsRegEx;

import org.testng.annotations.Test;

public class TestNGMain {
	@Test(groups = {"windows.signup", "windows.login"})
	public void test1() {
		System.out.println("Works for windows Signup and Login");
	}
	
	@Test(groups = {"mac.signup", "mac.login"})
	public void test2() {
		System.out.println("Works for mac Signup and Login");
	}
	
	@Test(groups = {"windows.login"})
	public void test3() {
		System.out.println("Works only for windows Login");
	}
	
}

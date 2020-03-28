package com.testNG_Groups;

import org.testng.annotations.Test;

public class TestNGMain {
	@Test(groups = {"signup", "login"})
	public void test1() {
		System.out.println("Works for both Signup and Login");
	}
	
	@Test(groups = {"signup", "login"})
	public void test2() {
		System.out.println("Works for both Signup and Login");
	}
	
	@Test(groups = {"login"})
	public void test3() {
		System.out.println("Works only for Login");
	}
	
}

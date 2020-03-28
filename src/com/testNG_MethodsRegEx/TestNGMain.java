package com.testNG_MethodsRegEx;

import org.testng.annotations.Test;

public class TestNGMain {
	@Test(groups = {"signup", "login"})
	public void test1Windows() {
		System.out.println("test1 method gets executed");
	}
	
	@Test(groups = {"signup", "login"})
	public void test2Mac() {
		System.out.println("test2 method gets executed");
	}
	
	@Test(groups = {"login"})
	public void test3Windows() {
		System.out.println("test3 method gets executed");
	}
	
}

package com.testNG_Methods;

import org.testng.annotations.Test;

public class TestNGMain {
	@Test(groups = {"signup", "login"})
	public void test1() {
		System.out.println("test1 method gets executed");
	}
	
	@Test(groups = {"signup", "login"})
	public void test2() {
		System.out.println("test2 method gets executed");
	}
	
	@Test(groups = {"login"})
	public void test3() {
		System.out.println("test3 method gets executed");
	}
	
}

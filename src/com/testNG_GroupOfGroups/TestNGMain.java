package com.testNG_GroupOfGroups;

import org.testng.annotations.Test;

public class TestNGMain {
	@Test(groups = {"signup", "login"})
	public void test1() {
		System.out.println("Works for both Signup and Login page");
	}
	
	@Test(groups = {"home", "products"})
	public void test2() {
		System.out.println("Works for both Home and Products page");
	}
	
	@Test(groups = {"checkout","orderconfirmation"})
	public void test3() {
		System.out.println("Works for both Checkout and OrderConfirmation");
	}
	
}

package com.testNG_EnableAttribute;

import org.testng.annotations.Test;

//--------------------------------------------------------------------------------------------------------
//include/exclude in testng.xml file and enabled=true/enabled=false in @Test/@Before,@After works the same
//--------------------------------------------------------------------------------------------------------
public class TestNGMain {
	@Test(enabled = true)
	public void test1() {
		System.out.println("First test executed");
	}
	
	//When used at the method level @Test(enabled=false) annotation is functionally equivalent to @Ignore
	@Test(enabled = false)
	public void test2() {
		System.out.println("Second test executed");
	}
	
	@Test(enabled = false)
	public void test3() {
		System.out.println("Third test executed");
	}
	
}

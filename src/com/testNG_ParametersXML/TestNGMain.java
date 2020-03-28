package com.testNG_ParametersXML;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMain {
	@Parameters("browser")
	@Test
	public void test1(String browserName) {
		System.out.println("This test runs on "+browserName+" browser");
	}
	
	//if the parameter is not specified for the second method, it will consider Optional value as browser value
	@Test
	public void test2(@Optional("Firefox") String browserName) {
		System.out.println("This test runs on "+browserName+" browser"); //prints Firefox
	}
	
	@Parameters("browser")
	@Test
	public void test3(@Optional("Firefox") String browserName) {
		System.out.println("This test runs on "+browserName+" browser"); //prints Chrome
	}
}

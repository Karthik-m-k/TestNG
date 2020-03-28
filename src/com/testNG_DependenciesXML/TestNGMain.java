package com.testNG_DependenciesXML;

import org.testng.annotations.Test;

public class TestNGMain {
	@Test(groups = "regression")
	public void test1() {
		System.out.println("Independent Group regression");
	}
	
	@Test(groups = "smokeTest")
	public void test2() {
		System.out.println("Independent Group smokeTest");
	}
	
	@Test
	public void test3() {
		System.out.println("Dependent on regression Group");
	}
	
	@Test
	public void test4() {
		System.out.println("Dependent on both regression and smokeTest Groups");
	}
}

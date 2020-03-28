package com.testNG_DependenciesMethods;

import org.testng.annotations.Test;


public class TestNGMain {
	@Test
	public void test1() {
		System.out.println("Independent Method test1");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("Dependent on Test1 method");
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3() {
		System.out.println("Dependent on Test2 Method");
	}
	
	@Test
	public void test4() {
		System.out.println("Independent Method test4");
	}
	
	//DependsOnMethods accepts RegEx as well
	
	@Test(dependsOnMethods = "test4")
	public void test5() {
		System.out.println("Dependent on Test4 Method");
	}

		//-------------------------------------------------------------------------------------------//
		//Note:  as stated before, the order of invocation for dependsOnMethods is not guaranteed to //
		//be the same across test runs.																 //
		//-------------------------------------------------------------------------------------------//
		//Example output:
	
			//----------------------------------------------------------
			//	[RemoteTestNG] detected TestNG version 7.2.0
			//	Independent Method test1
			//	Independent Method test4
			//	Dependent on Test1 method
			//	Dependent on Test4 Method
			//	Dependent on Test2 Method
			//	PASSED: test1
			//	PASSED: test4
			//	PASSED: test2
			//	PASSED: test5
			//	PASSED: test3
			//
			//	===============================================
			//	    Default test
			//	    Tests run: 5, Failures: 0, Skips: 0
			//	===============================================
			//
			//
			//	===============================================
			//	Default suite
			//	Total tests run: 5, Passes: 5, Failures: 0, Skips: 0
			//	===============================================
			//----------------------------------------------------------
}

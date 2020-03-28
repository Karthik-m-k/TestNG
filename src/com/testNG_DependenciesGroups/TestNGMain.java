package com.testNG_DependenciesGroups;

import org.testng.annotations.Test;

public class TestNGMain {
	@Test(groups = "test1")
	public void test1() {
		System.out.println("Independent Group");
	}
	
	@Test(dependsOnGroups = "test1", groups = "test2")
	public void test2() {
		System.out.println("Dependent on Test1 method");
	}
	
	@Test(dependsOnGroups = "test2")
	public void test3() {
		System.out.println("Dependent on Test2 Method");
	}
	
	//groups accepts RegEx as well
	@Test(dependsOnGroups = "test1.*")
	public void test4() {
		System.out.println("Dependent on Test1 Method");
	}
	//-------------------------------------------------------------------------------------------//
	//Note:  as stated before, the order of invocation for methods that belong in the same group //
	//is not guaranteed to be the same across test runs.										 //
	//-------------------------------------------------------------------------------------------//
	//Example output:
	
			//	[RemoteTestNG] detected TestNG version 7.2.0
			//	Independent Group
			//	Dependent on Test1 method
			//	Dependent on Test1 Method
			//	Dependent on Test2 Method
			//	PASSED: test1
			//	PASSED: test2
			//	PASSED: test4
			//	PASSED: test3
			//
			//===============================================
			//    Default test
			//    Tests run: 4, Failures: 0, Skips: 0
			//===============================================
			//
			//
			//===============================================
			//Default suite
			//Total tests run: 4, Passes: 4, Failures: 0, Skips: 0
			//===============================================
			}

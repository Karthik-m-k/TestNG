package com.testNG_IgnoreTestsMethodLevel;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//TestNG lets you ignore all the @Test methods :
	//In a class (or)
	//In a particular package (or)
	//In a package and all of its child packages
//using the new annotation @Ignore.

public class TestNGMain {
	@Test
	public void test1() {
		System.out.println("test1 will be executed since it is not ignored and remaining 2 methods won't be executed");
	}
	
	//When used at the method level @Ignore annotation is functionally equivalent to @Test(enabled=false).
	@Ignore
	@Test
	public void test2() {
		System.out.println("test2 will not be executed since it is ignored");
	}
	
	@Ignore
	@Test
	public void test3() {
		System.out.println("test3 will not be executed since it is ignored");
	}
	
	//Output
	
		//-------------------------------------------------------
		//	[RemoteTestNG] detected TestNG version 7.2.0
		//
		//	===============================================
		//	    Default test
		//	    Tests run: 0, Failures: 0, Skips: 0
		//	===============================================
		//
		//
		//	===============================================
		//	Default suite
		//	Total tests run: 0, Passes: 0, Failures: 0, Skips: 0
		//	===============================================
		//
		//	[TestNG] No tests found. Nothing was run					//This is the message shown in console when no tests found
	//-----------------------------------------------------------
}

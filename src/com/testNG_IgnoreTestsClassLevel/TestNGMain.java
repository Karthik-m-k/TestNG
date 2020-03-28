package com.testNG_IgnoreTestsClassLevel;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//TestNG lets you ignore all the @Test methods :
	//In a class (or)
	//In a particular package (or)
	//In a package and all of its child packages
//using the new annotation @Ignore.

@Ignore
public class TestNGMain {
	@Test
	public void test1() {
		System.out.println("test1 will not be executed since it is ignored");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 will not be executed since it is ignored");
	}
	
	@Test
	public void test3() {
		System.out.println("test3will not be executed since it is ignored");
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

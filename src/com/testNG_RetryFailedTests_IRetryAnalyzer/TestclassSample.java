package com.testNG_RetryFailedTests_IRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestclassSample {
	@Test(retryAnalyzer = MyRetry.class)
	  public void test1() {
	    Assert.fail();
	  }
}

//Run specific .java file from cmd prompt:
//1) Download TestNG jars
//2) Create a lib folder in your project and add TestNG jars
//3) Right click on specific .Java file in you project from Eclipse --> TeseNG --> Convert to TestNG. This will create  a .xml file on project level.
//
//Goto Command Prompt and run below commands: 
//
//Change the directory till your package
//1) cd F:\Karthik\Selenium\Practice\TestNGGroups\src\com\testNG_ClassLevelTESTAnnotation
//2) set classpath=F:\Karthik\Selenium\Practice\TestNGGroups\bin;F:\Karthik\Selenium\Practice\TestNGGroups\lib\*
//3) java org.testng.TestNG F:\Karthik\Selenium\Practice\TestNGGroups\testng.xml
//
//This will run .Java file present in testNG_ClassLevelTESTAnnotation Package
//
//
//
//Run multiple packages/entire project from cmd prompt:
//1) Download TestNG jars
//2) Create a lib folder in your project and add TestNG jars
//3) Right click on specific .Java file in you project from Eclipse --> TeseNG --> Convert to TestNG. This will create  a .xml file on project level.
//
//Goto Command Prompt and run below commands: 
//
//Change the directory till your project
//1) cd F:\Karthik\Selenium\Practice\TestNGGroups
//2) set classpath=F:\Karthik\Selenium\Practice\TestNGGroups\bin;F:\Karthik\Selenium\Practice\TestNGGroups\lib\*
//3) java org.testng.TestNG F:\Karthik\Selenium\Practice\TestNGGroups\testng.xml
//
//This will run .Java file present in testNG_ClassLevelTESTAnnotation Package
//
//
//Run Failed tests from Command prompt
//Java -cp "F:\Karthik\Selenium\Practice\TestNGGroups\lib\*;F:\Karthik\Selenium\Practice\TestNGGroups\bin" org.testng.TestNG test-output/testng-failed.xml
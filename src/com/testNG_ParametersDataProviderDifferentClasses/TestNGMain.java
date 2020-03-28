package com.testNG_ParametersDataProviderDifferentClasses;

import org.testng.annotations.Test;

	//By default, the data provider will be looked for in the current test class or one of its base classes. 
	//If you want to put your data provider in a different class, it needs to be a static method or a class with a non-arg constructor, 
	//and you specify the class where it can be found in the dataProviderClass attribute:
	
public class TestNGMain {
	@Test(dataProvider = "test1", dataProviderClass = StaticProvider.class)
	public void verifyData(String a, String b) { //b should be Integer if it is declared as new Integer(19) in @DataProvider method
		System.out.println(a +" "+ b);
	}
}

package com.testNG_ParametersDataProviderDifferentClasses;

import org.testng.annotations.DataProvider;

public class StaticProvider {
	@DataProvider(name="test1")
	public static  Object[][] createData(){ //Method should be Static
		return new Object[][] {
			{"Karthik", "18"}
		};
	}
}

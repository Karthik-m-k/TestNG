package com.testNG_ParametersDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMain {
	@DataProvider(name="test1")
	public Object[][] createData(){
		return new Object[][] {
			{"Karthik", "18"}
//			   {"Karna", new Integer(19)},
		};
	}
	
	//A @Test method specifies its Data Provider with the dataProvider attribute. 
	//This name must correspond to a method on the same class annotated with @DataProvider(name="...") with a matching name.

	@Test(dataProvider = "test1")
	public void verifyData(String a, String b) { //b should be Integer if it is declared as new Integer(19) in @DataProvider method
		System.out.println(a +" "+ b);
	}
}

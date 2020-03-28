package com.testNG_PartialGroups;

import org.testng.annotations.Test;

@Test(groups = "QA")
public class TestNGMain {
	@Test(groups = "SIT")
	public void test1() {
		System.out.println("Test case for SIT and QA Scenarios");
	}
	
	//In this class, test2() is part of the group "QA", which is defined at the class level, 
	//while test1() belongs to both "QA" and "SIT"
	@Test
	public void test2() {
		System.out.println("Test case for QA Scenarios");
	}
}

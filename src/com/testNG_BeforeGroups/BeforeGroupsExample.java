package com.testNG_BeforeGroups;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
//This should be checked again
public class BeforeGroupsExample {
	@BeforeGroups(groups = "IT Department")
	public void before_IT() {
		System.out.println("This method will be executed before the execution of IT Department group");
	}

	@Test(groups = { "IT Department" })
	public void testcase1() {
		System.out.println("Softwaxre Developer");
	}

	@Test(groups = { "IT Department" })
	public void testcase2() {
		System.out.println("QA Analyst");
	}

	@Test
	public void testcase3() {
		System.out.println("HR");
	}
}

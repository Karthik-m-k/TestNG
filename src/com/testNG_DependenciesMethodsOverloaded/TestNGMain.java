package com.testNG_DependenciesMethodsOverloaded;

import org.testng.annotations.Test;


public class TestNGMain {
	@Test
	public void test1(int a) {
		System.out.println("Int Method test1");
	}
	
	@Test
	public void test1(int a, int b) {
		System.out.println("Float Method test1");
	}
	
	@Test
	public void test1(int a, int b, int c) {
		System.out.println("Double Method test1");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("Depends on tes1");
	}
	
}

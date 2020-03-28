package com.testNG_ClassLevelTESTAnnotation;

import org.testng.annotations.Test;

//The effect of a class level @Test annotation is to make all the public methods of this class to become test methods 
//even if they are not annotated. You can still repeat the @Test annotation on a method if you want to add certain attributes.
@Test
public class TestNGMain {
	public void test1() {
		System.out.println("test1 method gets executed");
	}
	
	public void test2() {
		System.out.println("test2 method gets executed");
	}
	
	public void test3() {
		System.out.println("test3 method gets executed");
	}
	
	//test4 will be executed since it is a private method but annotated with @Test
	@Test
	private void test4() {
		System.out.println("Test4 private Method will get executed");
	}
	
	//test5 will not be executed since it is a private method and not annotated with @Test
	private void test5() {
		System.out.println("Test5 private Method will not be executed");
	}
	
}

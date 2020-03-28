package com.testNG_ParallelTests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class TestNGMain {
	@Test
	public void test1() {
		System.out.println("test1 method gets executed");
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String stringDate = sdf.format(date);
	    System.out.println("test1 method execution started at : "+stringDate);
		
	}
	
	@Test
	public void test2() {
		System.out.println("test2 method gets executed");
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String stringDate = sdf.format(date);
		System.out.println("test2 method execution started at : "+ stringDate);
	}
	
	@Test
	public void test3() {
		System.out.println("test3 method gets executed");
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String stringDate = sdf.format(date);
		System.out.println("test3 method execution started at : "+ stringDate);
	}
	@Test
	public void test4() {
		System.out.println("test4 method gets executed");
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String stringDate = sdf.format(date);
	    System.out.println("test4 method execution started at : "+stringDate);
		
	}
	
	@Test
	public void test5() {
		System.out.println("test5 method gets executed");
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String stringDate = sdf.format(date);
		System.out.println("test5 method execution started at : "+ stringDate);
	}
	
	@Test
	public void test6() {
		System.out.println("test6 method gets executed");
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String stringDate = sdf.format(date);
		System.out.println("test6 method execution started at : "+ stringDate);
	}
}

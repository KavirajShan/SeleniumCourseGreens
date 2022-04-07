package com.kavi;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {

	
	
	@BeforeClass
	public static void sysout() {
		// TODO Auto-generated method stub

		System.out.println("BC");
	}
	
	
	@Test
	public void test() {
		
		
		System.out.println("Test");
	}

	
	
	@AfterClass
	public static void afterclasss() {
		
		System.out.println("AC");
		// TODO Auto-generated method stub

	}
}

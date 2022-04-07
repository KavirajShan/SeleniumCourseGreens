package com.kavi;

import org.junit.BeforeClass;


	
	import java.util.Date;

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;



	public class TestingJunit  {
		static WebDriver driver;
		
		@BeforeClass
		public static void beforeClass() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");	
		}


		@AfterClass
		public static void after() {
			driver.close();
		}


		@Before
		public void BeforeMethod(){
			Date das=new Date();
			System.out.println(das);
		}


		@After
		public void AfterMethod() {
			Date da=new Date();
			System.out.println(da);
		}


		@Test
		public void test1() {
			
			WebElement findElement2 = driver.findElement(By.id("email"));
			findElement2.sendKeys("shvxkxv");
		}
	}
	
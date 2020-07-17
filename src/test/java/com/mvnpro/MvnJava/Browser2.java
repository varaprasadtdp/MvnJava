package com.mvnpro.MvnJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser2 {
	WebDriver driver;

	@Test
	public void launchchrome() {
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\seleniumdrivers\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		
//    	open test facebook page
		String baseUrl = "http://www.google.com";
		driver.get(baseUrl);
	
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);	
	}
			
		public static void main(String[] args) {
				Browser2 obj = new Browser2();
				obj.launchchrome();

		}
}

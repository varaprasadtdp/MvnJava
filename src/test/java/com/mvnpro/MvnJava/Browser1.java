package com.mvnpro.MvnJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser1 {
	WebDriver driver;

	@Test
	public void launchfirefox() {
		System.setProperty("webdriver.gecko.driver", "E:\\testing\\seleniumdrivers\\browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		
//    	open test facebook page
		String baseUrl = "http://www.google.com";
		driver.get(baseUrl);
	
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);	
	}
			
		public static void main(String[] args) {
				Browser1 obj = new Browser1();
				obj.launchfirefox();

		}
}
	
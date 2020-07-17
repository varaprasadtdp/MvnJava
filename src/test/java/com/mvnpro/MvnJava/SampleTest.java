package com.mvnpro.MvnJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {
	WebDriver driverC;
	
	public void launchfirefox() {
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\seleniumdrivers\\browser\\chromedriver.exe");
		WebDriver driverC = new ChromeDriver();
		
//    	open test facebook page
		String baseUrl = "http://www.google.com";
		driverC.get(baseUrl);
	
		driverC.findElement(By.name("q")).sendKeys("java", Keys.ENTER);	
	}
			
		public static void main(String[] args) {
			SampleTest obj = new SampleTest();
				obj.launchfirefox();

		}
}
	
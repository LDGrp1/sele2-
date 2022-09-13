package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chilWindw {

	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver", "G:\\AVINASH IMP\\Tools\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/doodles");
		
		
		
	}
}

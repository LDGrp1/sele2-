package com.selenium;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scfrshot {

	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\AVINASH IMP\\Tools\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/doodles");
		driver.manage().window().maximize();
		
	TakesScreenshot sc = (TakesScreenshot)driver;
		File source =sc.getScreenshotAs(OutputType.FILE);
		File destination=new File("G:\\ooo.png");
    	
	}


		
	}
	

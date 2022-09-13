package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class drpdwn {

	
	public class Test {
		
		public static void main(String[] args) {
			//first we need to invoke the browser and then launch the url/application
			System.setProperty("webdriver.chrome.driver", "G:\\AVINASH IMP\\Tools\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.google.com/");
			
			//isDisplayed()
//			
		WebElement g=driver.findElement(By.xpath("//a[text()='Gmail']"));
			
//			
//			boolean gg = g.isDisplayed();
//			
//			System.out.println(gg);
			
		 System.out.println(driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed());
			
		 System.out.println(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
		 

			driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F") ;
			
			driver.findElement(By.cssSelector("input#gender-male")).click();
			
			System.out.println(driver.findElement(By.cssSelector("input#gender-male")).isSelected());
		  
		}

	}
}

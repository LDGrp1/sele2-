package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WatasPP {

public static void main (String []args) {
	
	System.setProperty("webdriver.chrome.driver", "G:\\AVINASH IMP\\Tools\\chromedriver.exe");

	WebDriver driver =  new ChromeDriver ();

	driver.manage().window().maximize();

	driver.get("https://www.google.com/");

	driver.findElement(By.xpath("//a[text()='Terms']")).click();
	// String id =driver.getWindowHandle();
	// System.out.println(id);

	Set<String>ids=driver.getWindowHandles();
	System.out.println(ids.size());
	System.out.println(ids);
	
	Iterator<String>it =ids.iterator();
	
	String parentWindowid= it.next();
	String ChildWindowid=it.next();
	
	driver.switchTo().window(ChildWindowid);
	
	driver.findElement(By.xpath("//a[text()='Introduction']")).click();
	driver.switchTo().window(parentWindowid);
	
	
}




}

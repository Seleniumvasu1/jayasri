package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		//captured the header section by using className and stored in webElement
	WebElement header=driver.findElement(By.className("sw_tb"));
	//captured the links under header section byusing tagName and stored in webement
	List<WebElement> headerLinks=header.findElements(By.tagName("a"));
	System.out.println(headerLinks.size());
	for (int i = 0; i < headerLinks.size(); i++) 
	{
		//System.out.println(headerLinks.get(i).getText());
		if(!headerLinks.get(i).getText().isEmpty())
		{
			System.out.println(headerLinks.get(i).getText());
			
		}
	}
	

	}

}

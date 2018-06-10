package com.vasu.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest
{
	public static void main(String[] args) throws Exception 
	{
		String expTitle="Selenium - Yahoo India Search Results";
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("Http://yahoo.com");
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		driver.findElement(By.id("uh-search-button")).click();
		//Thread.sleep(3000);
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		if (expTitle.equals(actTitle))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
	}

}

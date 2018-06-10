package com.vasu.practies;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DownloadFileTest
{
	public static void main(String[] args) throws Exception 
	{
		ChromeDriver  driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");

		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		WebElement header= driver.findElement(By.className("sw_tb"));
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		
			System.out.println(headerLinks.size());
			for(int i=0;i<headerLinks.size();i++)
			System.out.println(headerLinks.get(i).getText());

	}

}

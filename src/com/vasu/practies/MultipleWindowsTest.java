package com.vasu.practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		
	Set<String>	windows=driver.getWindowHandles();
	for(String child:windows)
	{
		//System.out.println(child);
		if (!parent.equals(child)) 
		{
			driver.switchTo().window(child);
			driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		}
	}
		

	}

}

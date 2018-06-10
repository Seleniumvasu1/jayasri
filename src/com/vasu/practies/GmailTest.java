package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest 
{

	public static void main(String[] args) 
	{
		String expTitle="Gmail";
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("Http://google.co.in");
	driver.manage().window().maximize();
	//images
	//driver.findElement(By.xpath("//a[@class='gb_P'][@data-pid='2']")).click();
	//using text method
	driver.findElement(By.xpath("//*[normalize-space(text())='Images']")).click();
	

	}

}

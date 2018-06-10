package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("Http://jqueryui.com/resizable/");
		  driver.manage().window().maximize();
		  
	driver.switchTo().frame(0);
		  WebElement rs =driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		 
		  
		  Actions resizable=new Actions(driver);
		  
		  resizable.clickAndHold(rs).moveByOffset(80, 90).release(rs).build().perform();


	}

}

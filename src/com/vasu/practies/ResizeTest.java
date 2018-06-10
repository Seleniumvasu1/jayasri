package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://jqueryui.com/slider/");
		  driver.manage().window().maximize();
		  
	driver.switchTo().frame(0);
		  WebElement sl =driver.findElement(By.xpath(".//*[@id='slider']/span"));
		 
		  
		  Actions slider=new Actions(driver);
		  
		  slider.clickAndHold(sl).moveByOffset(80, 0).release(sl).build().perform();
		  
		  Thread.sleep(3000);
		  
		  slider.clickAndHold(sl).moveByOffset(-80, 0).release(sl).build().perform();


	}

}

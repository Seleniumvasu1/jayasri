package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
@Test
public void adminLogin()
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	//Assert.assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome","Both the Stings are  not equal");
	Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
}
}

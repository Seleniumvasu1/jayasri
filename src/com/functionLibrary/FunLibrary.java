package com.functionLibrary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunLibrary 
{
//variable
	public FirefoxDriver driver;
	public String res;
	//appLaunch
	public  String appLaunch(String url)
	{
	  driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		if(driver.findElement(By.id("txtUsername")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fails";
		}
		return res;
		
	}
	//appLogin
	public String appLogin(String userName,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.id("welcome")).isDisplayed()) 
		{
			res="Pass";
		
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogout
	//appClose
	//empAdd
	public String empAdd(String fName,String lName) throws Exception
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		
		//driver.findElement(By.id("photofile")).click();
		//driver.findElement(By.id("photofile")).sendKeys("E:\\Koala.jpg");
		//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\jay.exe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
		{
		res="Pass";
		
		}else
		{
			res="Fail";
		}
		return res;
	}
	
	public static void main(String[] args)
	{
		FunLibrary app=new FunLibrary();
		//app.appLaunch("http://opensource.demo.orangehrmlive.com");
		//String results=app.appLaunch("http://opensource.demo.orangehrmlive.com");
		//System.out.println(results);
		app.appLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println(app.appLogin("Admin", "admin"));
	}
}

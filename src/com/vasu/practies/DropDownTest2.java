package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest2
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
    driver.manage().window().maximize();
     List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i < list.size();i++)
	{
		//getting all the links
		System.out.println(list.get(i).getText());
		
		//clicking the link
		
		if (list.get(i).getText().equals("REGISTER"))
		{
			list.get(i).click();
			break;
		}
	}
		WebElement drop = driver.findElementByName("country");
		List<WebElement> dropdownlist = drop.findElements(By.tagName("option"));
		for (int j=0;j < dropdownlist.size();j++)
		{
			System.out.println(dropdownlist.get(j).getText());
		}
		
		

	}	



}

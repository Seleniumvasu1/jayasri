package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest 
{
	public static void main(String[] args)
	{
FirefoxDriver driver=new FirefoxDriver();
driver.get("Http://Google.com");
driver.manage().window().maximize();
//capture all the links
List<WebElement> list=driver.findElements(By.tagName("a"));
System.out.println(list.size());
for (int i = 0; i < list.size(); i++)
{
	//System.out.println(list.get(i).getText());
	/*if(!list.get(i).getText().isEmpty())
	{
		System.out.println(list.get(i).getText());
	}
*/
	if (list.get(i).getText().equals("Settings"))
	{
		list.get(i).click();
		break;
	}
	}


	}

}

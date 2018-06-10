package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	
	Select slt=new Select(drop);
	slt.selectByIndex(30);
	//slt.selectByVisibleText("Baby");
	//slt.selectByValue("search-alias=beauty");
/*List<WebElement> dropList=slt.getOptions();
for(WebElement element:dropList)
{
	System.out.println(element.getText());
}*/

	//System.out.println(slt.isMultiple());
	//System.out.println(slt.getFirstSelectedOption().getText());
	List<WebElement> list=slt.getAllSelectedOptions();
	System.out.println(list.size());
	for (int i = 0; i <list.size(); i++)
	{
		System.out.println(list.get(i).getText());
	}
	}

}

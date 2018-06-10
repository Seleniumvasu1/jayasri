package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		//table
		WebElement table=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));


for (int k = 1; k <=2; k++) 
{
	List<WebElement> radioButtons=table.findElements(By.name("group"+k));
	for (int i = 0; i < radioButtons.size(); i++) 
	{
		radioButtons.get(i).click();
		for (int j = 0; j < radioButtons.size(); j++)
		{
			System.out.println(radioButtons.get(j).getAttribute("checked")+"---"+radioButtons.get(j).getAttribute("value"));
		}
		System.out.println("#########");
		
	}
}

	}

}

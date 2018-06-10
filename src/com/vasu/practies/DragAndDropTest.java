package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://jqueryui.com/droppable/");
		  driver.manage().window().maximize();
		  
	List<WebElement> frames=  driver.findElements(By.tagName("iframe"));
	System.out.println(frames.size());
	//giving focus to frame
	driver.switchTo().frame(0);
	
		  WebElement drag =driver.findElement(By.id("draggable"));
		  WebElement drop=driver.findElement(By.id("droppable"));
		  
		  Actions dAd=new Actions(driver);
		  
		  dAd.dragAndDrop(drag, drop).build().perform();



	}

}

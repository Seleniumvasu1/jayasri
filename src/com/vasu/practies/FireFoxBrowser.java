package com.vasu.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser
{

	public static void main(String[] args) {
		
	//launching Firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		//navigate to gmail
		driver.get("Http://gmail.com");

	}

}

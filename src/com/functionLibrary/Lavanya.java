package com.functionLibrary;

public class Lavanya 
{

	public static void main(String[] args) throws Exception 
	{
		//applaunch
		//appLogin
		//addEmp
		FunLibrary app=new FunLibrary();
		app.appLaunch("http://opensource.demo.orangehrmlive.com");
		app.appLogin("Admin", "admin");
		app.empAdd("Vasu2345", "Seleniu786");

	}

}

package com.testng;

import org.testng.annotations.Test;

public class MultipleTestCase
{
@Test()
public void appLaunch()
{
	System.out.println("AppLaunch");
}
@Test()
public void appLogin()
{
	System.out.println("AppLogin");
}
@Test()
public void appClose()
{
	System.out.println("AppClose");
}
}

package com.vasu.java;

public class SwitchStatement {

	public static void main(String[] args) 
	{
		//to dispaly weekdaynames  for a given number
		
		int weekNumber=5;
		switch (weekNumber) 
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("WednessDay");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of Range");
			break;
		}

	}

}

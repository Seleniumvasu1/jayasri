package com.vasu.java;

public class ForLoopTest 
{
	public static void main(String[] args) 
	{
		//to dispaly selenium Message 20 times
		/*for(int i=1;i<=20;i++)
		{
			System.out.println(i+"    "+"Selenium");
		}*/
		
		for (int i = 1; i <=10; i++)//table 1
		{
			for (int j =1; j <=10; j++) //10 iteration
			{
				System.out.println(i+"   X   "+j+"  =  "+i*j);
			}
			
		}
	}
	

}

package com.vasu.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args)
	{
		List<String> l=new ArrayList<>();
		//insert
		l.add("Selenium");
		l.add("Vasu");
		l.add("UFT");
		l.add("LR");
		l.add("lavanya");
		l.add("Selenium");
		System.out.println(l.size());
		/*for (int i = 0; i < l.size(); i++) 
		{
		System.out.println(l.get(i));	
		}*/
		for(String list:l)
		{
			System.out.println(list);
		}

	}

}

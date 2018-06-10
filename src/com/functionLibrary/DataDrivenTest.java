package com.functionLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest 
{
	public static void main(String[] args) throws Exception 
	{
		FunLibrary app=new FunLibrary();
		app.appLaunch("http://opensource.demo.orangehrmlive.com/");
		app.appLogin("Admin","admin");
File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
	int rcnt=ws.getLastRowNum();
	
	for (int i = 1; i <=rcnt+1; i++) 
	{
		String fName=ws.getRow(i).getCell(0).getStringCellValue();
		
		String lName=ws.getRow(i).getCell(1).getStringCellValue();
		
		String results=app.empAdd(fName, lName);
		
		ws.getRow(i).createCell(2).setCellValue(results);
		
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		
		
		
	}
	wb.close();
	//app.logut();
	//app.close();

	}

}

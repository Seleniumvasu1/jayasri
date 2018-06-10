package com.functionLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingData 
{
@Test
public void write() throws Exception
{
	File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	XSSFSheet ws=wb.getSheet("Sheet1");
	
	ws.getRow(1).createCell(2).setCellValue("lavanya");
	ws.getRow(2).createCell(2).setCellValue("jayasri");
	
	FileOutputStream fos=new FileOutputStream(src);
	wb.write(fos);
wb.close();
}
}

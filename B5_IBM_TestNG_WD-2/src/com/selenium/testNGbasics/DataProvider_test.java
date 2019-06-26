package com.selenium.testNGbasics;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProvider_test {
	String fpath= "resources\\dataprovidertest.xls";
	String SheetName="Sheet1";

	@Test (dataProvider="readexcel")
	public void composemail(String mailid,String msg)
	{
		System.out.println(mailid+"++"+msg);


	}


	/*@DataProvider
	public Object[][] datavalues()
	{
		return new Object[][] 
				{
			new Object[] {"abc.gmail.com","1st id"},
			new Object[] {"xyz.gmail.com","2nd id"}
		};
	}*/
	@DataProvider
	public Object[][] readexcel() throws BiffException, IOException
	{
		System.out.println("Kavya");
		FileInputStream fs = new FileInputStream("resources\\dataprovidertest.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");

		int totalNoOfCols = sh.getColumns();
		int totalNoOfRows = sh.getRows();
		String[][] arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];

		
		arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];

		for (int i= 1 ; i < totalNoOfRows; i++) {
			for (int j=0; j < totalNoOfCols; j++) {
				arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
			}
		}

		return arrayExcelData;

	}
}


package com.selenium.util;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelFile {

	public static void main(String[] args) {
		
		
		   
		    
		        //System.out.println(System.getProperty("user.dir"));
		        File file = new File( "resources\\Google_search.xls");
		        System.out.println(file);
		        
		        Workbook workbook = null;
		        try {
		            workbook = Workbook.getWorkbook(file);
		            Sheet sheet = workbook.getSheet(0);
		                        //sheet.getCell(col, row)
		            Cell cell1 = sheet.getCell(0, 0);            // baseUrl
		            System.out.print(cell1.getContents() + ":"); 
		            Cell cell2 = sheet.getCell(0, 1);            // https://www.google.com/
		            System.out.println(cell2.getContents()); 

		
		            Cell cell3 = sheet.getCell(1, 0);            // Browser
		            System.out.print(cell3.getContents() + ":"); 
		            Cell cell4 = sheet.getCell(1, 1);            // chrome
		            System.out.println(cell4.getContents()); 
		            Cell cell5 = sheet.getCell(2, 0);            // searchText
		            System.out.print(cell5.getContents() + ":"); 
		            Cell cell6 = sheet.getCell(2, 1);            // JUnit TestCase
		            System.out.println(cell6.getContents()); 
		
		Cell cell7 = sheet.getCell(3, 0);            // searchPath
		            System.out.print(cell7.getContents() + ":"); 
		            Cell cell8 = sheet.getCell(3, 1);            // //*[@id="tsf"]/div[2]/div/div[1]/div/div[1]/input
		            System.out.println(cell8.getContents()); 
		        } catch (IOException e) {
		            e.printStackTrace();
		        } catch (BiffException e) {
		            e.printStackTrace();
		        } finally {
		            if (workbook != null) {
		                workbook.close();
		            }
		        }
		    }
	}



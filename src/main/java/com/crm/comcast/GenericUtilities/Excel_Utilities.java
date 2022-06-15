package com.crm.comcast.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utilities {

	public String getExceldata(String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./Excel/Data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c=r.getCell(cell);
		String edata = c.toString();
		book.close();
		return edata;
		
	}
	
}

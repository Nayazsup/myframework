package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_data_Excel {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./Excel/Data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(4);;
		Cell cell = row.createCell(2);
		cell.setCellValue("chappal");
		FileOutputStream fos=new FileOutputStream("./Excel/Data.xlsx");
		book.write(fos);
		book.close();

	}

}

package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_and_display_nextCell {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		String actdata="Hayato";
				
		FileInputStream fis=new FileInputStream("./Excel/Data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);
		if(data.equals(actdata))
		{
		 Cell cell2 = row.getCell(2);
		 System.out.println(cell2.getStringCellValue());
		 book.close();
		}else
		{
			book.close();
		}

	}

}

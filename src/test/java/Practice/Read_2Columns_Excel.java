package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_2Columns_Excel {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis=new FileInputStream("./Excel/Data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int	lastrow=sheet.getLastRowNum();
		System.out.println(lastrow);
		for(int i=0; i<lastrow; i++)
		{
			Row row = sheet.getRow(i);
			int lastcell = row.getLastCellNum();
			for(int j=0; j<lastcell ;j++)
			{
				Cell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.print(data+" ");

			}
			System.out.println();
		}
		book.close();
	}

}

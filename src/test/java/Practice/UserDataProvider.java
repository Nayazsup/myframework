package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.Excel_Utilities;

public class UserDataProvider {
	
	@Test(dataProvider ="bookTicketdataProvider" )
	
	public void bookTickets(String src, String dst, String ticket)
	{
		System.out.println("source is "+src+"destination is "+dst+" number of tickets is "+ticket);
	}
	
	
	@DataProvider
	public Object[][]  bookTicketdataProvider() throws Throwable
	{
		Object[][] objarr=new  Object[3][3];
	Excel_Utilities eu=new Excel_Utilities();
	
	String scr1 = eu.getExceldata("Sheet1", 11, 7);
	String dst1 = eu.getExceldata("Sheet1", 10, 7);
	String tno1 = eu.getExceldata("Sheet1", 7, 7);
	String scr2 = eu.getExceldata("Sheet1", 11, 7);
	String dst2 = eu.getExceldata("Sheet1", 9, 7);
String tno2 = eu.getExceldata("Sheet1", 6, 7);
String scr3 = eu.getExceldata("Sheet1", 11, 7);
String dst3 = eu.getExceldata("Sheet1", 8, 7);
String tno3 = eu.getExceldata("Sheet1", 5, 7);
	
	objarr[0][0]=scr1;
	objarr[0][1]=dst1;
	objarr[0][2]=tno1;
	
	objarr[1][0]=scr2;
	objarr[1][1]=dst2;
	objarr[1][2]=tno2;
					
	objarr[2][0]=scr3;
	objarr[2][1]=dst3;
	objarr[2][2]=tno3;
	return objarr;

}
}
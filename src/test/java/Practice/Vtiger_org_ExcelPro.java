package Practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger_org_ExcelPro {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		FileInputStream fis=new FileInputStream("./data/comman.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String password = pro.getProperty("password");
		String username = pro.getProperty("username");
		String url = pro.getProperty("url");
		String browser = pro.getProperty("browser1");
		if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();		
		Random rand=new Random();
		int oye = rand.nextInt(1000);
		
		
		FileInputStream fiis=new FileInputStream("./Excel/data.xlsx");
		Workbook book = WorkbookFactory.create(fiis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue()+oye;
		book.close();

		driver.findElement(By.name("accountname")).sendKeys(data);

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(4000);
		String actres = driver.findElement(By.className("dvHeaderText")).getText();
		if(actres.contains(data))
		{
			System.out.println("test case is pass");
		}else {
			System.out.println("test case is fail");
		}
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		 Actions act=new Actions(driver);
		 Thread.sleep(5000);
		act.moveToElement(ele).perform();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Sign Out")).click();
		



	}

}

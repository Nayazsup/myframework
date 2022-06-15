package Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Organization_and_DataExcel {

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
		//driver.findElement(By.xpath("(//a[@href='index.php?module=Accounts&action=EditView&return_action=DetailView&parenttab=Marketing'])[2]")).click();

		driver.findElement(By.name("accountname")).sendKeys("havu");

		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		/*Robot rbt=new Robot(); 
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("havu")).click();*/
		//Thread.sleep(2000);

		//driver.close();



	}
}



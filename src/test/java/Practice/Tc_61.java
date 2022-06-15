package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.comcast.GenericUtilities.Excel_Utilities;
import com.crm.comcast.GenericUtilities.File_Utilities;
import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class Tc_61 {
	public static void main(String[] args)throws Throwable {



		//get credentials and url
		File_Utilities ft=new File_Utilities();
		String browser = ft.getvalue("browser1");
		String username = ft.getvalue("username");
		String password = ft.getvalue("password");
		String url = ft.getvalue("url");


		//got browser
		Webdriver_Utilities bro=new Webdriver_Utilities();
		WebDriver driver = bro.getbrowser("firefox");

		//login
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);

		//get data
		Excel_Utilities et=new Excel_Utilities();
		String home = et.getExceldata("Sheet1", 3, 4);
		String vendorname = et.getExceldata("Sheet1", 4, 4);
		String proname = et.getExceldata("Sheet1", 1, 2);
		String subjetname = et.getExceldata("Sheet1", 5, 4);
		String billship = et.getExceldata("Sheet1", 6, 4);
		 String qnty = et.getExceldata("Sheet1", 7, 4);
		String title = et.getExceldata("Sheet1", 8, 4);
		String logtitle = et.getExceldata("Sheet1", 9, 4);

		wait.until(ExpectedConditions.titleContains(home));
		//move to more
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[.='More']"))).perform();
		Thread.sleep(3000);

		//create a vendor
		driver.findElement(By.name("Vendors")).click();
		wait.until(ExpectedConditions.titleContains("Vendors"));
		driver.findElement(By.xpath("//a[@href='index.php?module=Vendors&action=EditView&return_action=DetailView&parenttab=Inventory']")).click();
		driver.findElement(By.name("vendorname")).sendKeys(vendorname);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();



		//puchase order
		act.moveToElement(driver.findElement(By.xpath("//a[.='More']"))).perform();
		driver.findElement(By.name("Purchase Order")).click();
		wait.until(ExpectedConditions.titleContains("Purchase"));act.moveToElement(driver.findElement(By.xpath("//a[.='More']")));

		//create purchase order
		driver.findElement(By.xpath("//a[@href='index.php?module=PurchaseOrder&action=EditView&return_action=DetailView&parenttab=Inventory']")).click();
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("subject"))));
		ele.sendKeys(subjetname);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();

		//switching control to child window
		Set<String> all = driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(all);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);

		//select vendor name
		WebElement vendo = driver.findElement(By.xpath("//a[.='garena']"));
		wait.until(ExpectedConditions.visibilityOf(vendo));
		vendo.click();
		driver.switchTo().window(list.get(0));

		//billing address
		driver.findElement(By.name("bill_street")).sendKeys(billship);

		//shipping address
		driver.findElement(By.name("ship_street")).sendKeys(billship);

		//to scroll to element
		WebElement sicon = driver.findElement(By.id("searchIcon1"));
		Point location = sicon.getLocation();
		int y = location.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,y)");
		sicon.click();
		
		//switch control to child
		Set<String> all2 = driver.getWindowHandles();
		ArrayList<String> list2=new ArrayList<String>(all2);
		driver.switchTo().window(list2.get(1));
		Thread.sleep(4000);
		
		//selected product
		driver.findElement(By.xpath("//a[.='zayn']")).click();
		driver.switchTo().window(list2.get(0));
		Thread.sleep(2000);
		
		//purchase done
		driver.findElement(By.name("qty1")).sendKeys(qnty);
		//driver.findElement(By.name("qty1")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		wait.until(ExpectedConditions.titleContains(title));
		driver.findElement(By.name("Delete")).click();
		
		//handling popup
		Alert pop = driver.switchTo().alert();
		pop.dismiss();
		Thread.sleep(2000);
		
	
	//signout
	WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	act.moveToElement(element).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
	wait.until(ExpectedConditions.titleContains(logtitle));
	
	//login page
	if((driver.getTitle()).contains(logtitle))
	{
		System.out.println("login page is displayed");
	}else {
		System.out.println("testcase failed");
	}
	
	driver.quit();
	
	






	}

}

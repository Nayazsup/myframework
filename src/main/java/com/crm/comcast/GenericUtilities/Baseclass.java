package com.crm.comcast.GenericUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.comcast.pomrepositoryutility.HomePage;
import com.crm.comcast.pomrepositoryutility.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public 	WebDriver driver;
public File_Utilities fu=new File_Utilities();
public Webdriver_Utilities wu=new Webdriver_Utilities();
public Java_Utilities ju=new Java_Utilities();
public Excel_Utilities eu=new Excel_Utilities();
public static WebDriver sdriver;
	@BeforeSuite(groups = {"smoke","regression"})
	public void databaseconnection()
	{
		System.out.println("connecting database");
	}

	@BeforeTest(groups = {"smoke","regression"})
	public void executiontype()
	{
		System.out.println("do parallel execution");
	}
	
	
// @Parameters("browser")
	
	@BeforeClass(groups = {"smoke","regression"})
	public void getbrowser() throws Throwable
	{
		String browser=fu.getvalue("browser");
	// Reporter.log(browser, true);
		if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

			
		}else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		
		}else if(browser.equals("explorer"))
		{
			WebDriverManager.iedriver();
			driver=new InternetExplorerDriver();
			
		}else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sdriver=driver;

	}


	@BeforeMethod(groups = {"smoke","regression"})
	public void applicationlogin() throws Throwable
	{
String username=fu.getvalue("username");
String password = fu.getvalue("password");
String url = fu.getvalue("url");
LoginPage lp=new LoginPage(driver);

lp.logintoapp(url, username, password);
	}

	@AfterMethod(groups = {"smoke","regression"})
	public void logoutapplication()
	{
HomePage hp=new HomePage(driver);
hp.logout();
	}

	@AfterClass(groups = {"smoke","regression"})
	public void closebrowser()
	{
driver.quit();
	}

	@AfterTest(groups = {"smoke","regression"})
	public void executioncompleted()
	{
		System.out.println("type of execution completed");
	}

	@AfterSuite(groups = {"smoke","regression"})
	public void closedatabase()
	{
		System.out.println("database connection closed");
	}

}

package com.crm.comcast.GenericUtilities;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;

import org.apache.poi.hpsf.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * contains webdriver libraries
 * @author Nayaz Ahmed
 *
 */

public class Webdriver_Utilities {
	
	WebDriver driver;
	
	/**
	 * this methods is used to get the specific browser
	 * @para browser
	 */
	public WebDriver getbrowser(String browser)
	{
		if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			return driver;
		}else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			return driver;
		}else if(browser.equals("explorer"))
		{
				WebDriverManager.iedriver();
				driver=new InternetExplorerDriver();
				return driver;
		}else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		
		}
		
	}
	
	/**
	 * This method is used to get a screen shot
	 * @para driver
	 */
	public static void getscreenshot(WebDriver driver) throws Throwable
	{
		String photo="./Photo";
		Date d=new Date();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d+".jpeg");
		FileHandler.copy(scr, dst);
		
		}
	
	/**
	 *   it's an implicitly wait  Always wait for Element in DOM document & release the control if element available 
	 * @param driver
	 */
	public void impliwait(WebDriver driver) 
	{
		
		

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	/**
	 *   it's an Explicitly wait Always wait for Page to be loaded & available in GUI
	 * @param driver
	 * @param partailPageURL
	 */
		public void expliurl(WebDriver driver , String partailPageURL) 
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.urlContains(partailPageURL));
		}	
		
		/**
		 * it will wait till the title contains particular text 
		 * @para driver
		 * @para text
		 */
		public void explititle(WebDriver driver , String text) 
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleContains(text));
			
		}	
	
	/**
	 *   it's an Explicitly wait Always wait for Page to be loaded & available in GUI
	 * @param driver
	 * @param partailPageURL
	 */
		public void expliEle(WebDriver driver , WebElement element) 
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	
	
	/**
	 *  used to Switch to Any Window based on Window Title
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver , String parurltext) 
	{
	       Set<String> set = driver.getWindowHandles();
	        Iterator<String> it = set.iterator();

	          while (it.hasNext()) 
	          {
			          String wID = it.next();
			          driver.switchTo().window(wID);
			          String acturl = driver.getCurrentUrl();
			          if(acturl.contains(parurltext)) 
			          {
			        	  break;
			          }
		    	}
	}
	
	/**
	 * used to Switch to Alert Window & click on OK button
	 * @param driver
	 */
	public void alertAccept(WebDriver driver ,String expectedMsg)
	{
		Alert alt = driver.switchTo().alert();
		 if(alt.getText().trim().equalsIgnoreCase(expectedMsg.trim())) 
		 {
			 System.out.println("Alert Message is verified");
		 }
		 else 
		 {
			 System.out.println("Alert Message is not verified");
		 }
		 	alt.accept();
	}
	
	
	/**
	 * used to Switch to Alert Window & click on Cancel button
	 * @param driver
	 */
	public void swithToAlertWindowAndCancel(WebDriver driver, String expectedMsg) 
	{
		Alert alt = driver.switchTo().alert();
		 if(alt.getText().equals(expectedMsg)) 
		 {
			 System.out.println("Alert Message is verified");
		 }
		 else 
		 {
			 System.out.println("Alert Message is not verified");
		 }
		 	alt.dismiss();
	}
	
	/**
	 * used to Switch to Frame Window based on index
	 * @param driver
	 * @param index
	 */
	public void swithToFrame(WebDriver driver , int index) 
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * used to Switch to Frame Window based on id or name attribute
	 * @param driver
	 * @param id_name_attribute
	 */
	public void swithToFrame(WebDriver driver , String id_name_attribute) 
	{
		driver.switchTo().frame(id_name_attribute);
	}
	
	/**
	 * used to select the value from the dropDwon  based on index
	 * @param driver
	 * @param index
	 */
	public void select(WebElement element , int index) 
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * used to select the value from the dropDwon  based on value / option avlaible in GUI
	 * @param element
	 * @param value
	 */
	public void selectbyvtext(WebElement element , String text) 
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * used to place mouse cursor on specified element
	 * @param driver
	 * @param elemnet
	 */
	public void mouseOverOnElement(WebDriver driver , WebElement elemnet)
	{
		Actions act = new Actions(driver);
		act.moveToElement(elemnet).perform();
	}
	
	/**
	 * 	 used to right click  on specified element
	 * @param driver
	 * @param elemnet
	 */
	public void rightClickOnElement(WebDriver driver , WebElement elemnet)
	{
		Actions act = new Actions(driver);
		act.contextClick(elemnet).perform();
	}
	
	/**
	 * 
	 * @param driver
	 * @param javaScript
	 */
	public void executeJavaScript(WebDriver driver , String javaScript) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(javaScript, null);
	}
	
	/*
	 * To scroll the page
	 * 
	 */
	public void scrollBy(WebDriver driver,int y)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");
	}
	
	
	
	
	   public void waitAndClick(WebElement element) throws InterruptedException
	   {
		   int count = 0;
	       while(count<20) 
	       {
		    	   try {
		    	       element.click();
		    	       break;
		    	   		}
		    	   catch(Throwable e)
		    	   {
		    		   Thread.sleep(1000);
		    		   count++;
		    	   }
	       }
	   }  
	    /**
	     * pass enter Key appertain in to Browser
	     * @param driver
	     */
	   public void passEnterKey(WebDriver driver) 
	   	{
		   Actions act = new Actions(driver);
		   act.sendKeys(Keys.ENTER).perform();
	   	} 	
	   
	   /**
	    * this method is used to perform move over action
	    */
	public void movetoele(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	/**
	 * this method is used to perform rightclick action
	 */
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}

}



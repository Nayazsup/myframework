package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class CreateContactPage extends Webdriver_Utilities {
	WebDriver driver;
	public CreateContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		/**
		 * Homepage
		 */
	}

	@FindBy(name = "lastname")
	private WebElement lastntf;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;

	public WebElement getLastntf() {
		return lastntf;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public void lastname(String lname)
	{
		expliEle(driver, lastntf);
		lastntf.sendKeys(lname);
	}
	
	public void clicksave()
	{
		savebtn.click();
	}
}

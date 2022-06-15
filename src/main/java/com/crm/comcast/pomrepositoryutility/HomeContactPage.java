package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class HomeContactPage extends Webdriver_Utilities {

	WebDriver driver;
	public HomeContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		/**
		 * Homepage
		 */
	}
	@FindBy(linkText = "Contacts")
	private WebElement contlink;

	public WebElement getContlink() {
		return contlink;
	}
	
	public void homecontact()
	{
		//expliEle(driver, contlink);
		contlink.click();
	}
}

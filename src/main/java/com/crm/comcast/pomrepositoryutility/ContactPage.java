package com.crm.comcast.pomrepositoryutility;
/**
 * 
 * @Nayaz_Ahmed
 *
 */

import org.apache.xmlbeans.impl.common.XPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class ContactPage extends Webdriver_Utilities {
	WebDriver driver;
	
	public ContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement plusimg;

	public WebElement getPlusimg() {
		return plusimg;
	}
	
	public void clickonplus()
	{
		expliEle(driver, plusimg);
		plusimg.click();
		
		
	}
	
}

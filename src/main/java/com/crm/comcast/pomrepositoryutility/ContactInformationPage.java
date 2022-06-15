package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class ContactInformationPage extends Webdriver_Utilities {
	WebDriver driver;
	
	public ContactInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(.,'Information')]")
	private WebElement coninfo;
	
	@FindBy(xpath = "//input[@title='Delete [Alt+D]']")
	private WebElement deletbutton;

	public WebElement getDeletbutton() {
		return deletbutton;
	}

	public WebElement getConinfo() {
		return coninfo;
	}
	public String contactinfotext()
	{
		expliEle(driver, coninfo);
		String cintext = coninfo.getText();
		return cintext;
	}
	
	
	
	public void deletcontact()
	{
		expliurl(driver, "Contacts&parenttab");
		deletbutton.click();
		alertAccept(driver, "Are you sure you want to delete this record?");
		System.out.println("contact deleted");
		
	}
}

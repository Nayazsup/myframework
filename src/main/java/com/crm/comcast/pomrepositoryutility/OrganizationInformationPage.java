package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class OrganizationInformationPage extends Webdriver_Utilities {
	WebDriver driver;
	
	public OrganizationInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
    private WebElement organizationtext ;
	
	@FindBy(name="Delete")
	private WebElement deletebutton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganizationtext() {
		return organizationtext;
	}

	public WebElement getDeletebutton() {
		
		return deletebutton;
	}
	
	public void organinfo( String organname)
	{
		expliEle(driver, organizationtext);
		if((organizationtext.getText()).contains(organname))
		{
			System.out.println("organization created");
		}else {
			System.out.println("organization not created");
		}
	}
	 
	
	
	
	
}

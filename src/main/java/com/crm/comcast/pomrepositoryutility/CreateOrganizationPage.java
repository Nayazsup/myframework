package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class CreateOrganizationPage extends Webdriver_Utilities {
	public WebDriver driver;
	public CreateOrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organnametf;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement savebutton;

	public WebElement getOragannametf() {
		return organnametf;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	public void enterorganname(String organizationname) {
		//expliEle(driver, organnametf);
		organnametf.sendKeys(organizationname);
	}
	
	public void clickonsave()
	{
		savebutton.click();
	}

}

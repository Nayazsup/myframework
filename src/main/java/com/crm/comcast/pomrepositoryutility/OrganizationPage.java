package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class OrganizationPage extends Webdriver_Utilities {
	WebDriver driver;
	public OrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusbutton;
	
	@FindBy(className = "txtBox")
	private WebElement searchfortf;
	
	@FindBy(id="bas_searchfield")
	private WebElement indropdown;
	
	@FindBy(name = "submit")
	private WebElement searchnowbutton ;

	public WebElement getSearchnow() {
		return searchnowbutton;
	}

	public WebElement getPlusimg() {
		return plusbutton;
	}
	
	public WebElement getSearchfortf() {
		return searchfortf;
	}

	public WebElement getIndropdown() {
		return indropdown;
	}

	public void neworganizaion()
	{
		plusbutton.click();
	}
   public void searchorganization(String orgname)
   {
	   searchfortf.sendKeys(orgname);
   }
   public void selectindropdown(String visibletext)
   {
	   selectbyvtext(indropdown, visibletext);
   }
   
   public void searchnowbt()
   {
	   searchnowbutton.click();
   }
}

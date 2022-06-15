package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;
/**
 * Homepage webelement
 * @Nayaz_ahmed 
 *
 */
public class HomePage extends Webdriver_Utilities  {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		/**
		 * Homepage
		 */
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement organlink;
	
	@FindBy(linkText ="Contacts")
	private WebElement contactlink;
	
	@FindBy(linkText = "Products")
	private WebElement productlink;
	
	@FindBy(linkText ="More")
	private WebElement morelink;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignslink;
	
	@FindBy(linkText = "Purchase Order")
	private WebElement purchaseolink;
	
	@FindBy(linkText = "Vendors")
	private WebElement vendlink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminicon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganlink() {
		return organlink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getProductlink() {
		return productlink;
	}

	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getCampaignslink() {
		return campaignslink;
	}

	public WebElement getPurchaseolink() {
		return purchaseolink;
	}

	public WebElement getVendlink() {
		return vendlink;
	}

	public WebElement getAdminicon() {
		return adminicon;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	
public void navorgan()
{
	organlink.click();
}
public void navproduct()
{
	productlink.click();
}
public void navcontact()
{
	contactlink.click();
	}

public void navvendor()
{
	movetoele(driver, morelink);
	expliEle(driver, vendlink);
	vendlink.click();
}

public void navpurchaseo()
{
	movetoele(driver, morelink);
	expliEle(driver, purchaseolink);
	purchaseolink.click();
}
	
	public void navcampaign()
	{
		movetoele(driver, morelink);
		expliEle(driver, campaignslink);
		campaignslink.click();
	}
	
	public void logout()
	{
		movetoele(driver, adminicon);
		expliEle(driver, signoutlink);
		signoutlink.click();
	}
	
	

}

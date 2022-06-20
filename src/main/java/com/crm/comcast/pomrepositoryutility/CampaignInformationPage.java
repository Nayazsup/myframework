package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInformationPage {
	WebDriver driver;
	
	public CampaignInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "dvHeaderText")
	private WebElement campaigninfo;
	
	@FindBy(name = "Delete")
	private WebElement deletbutton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCampaigninfo() {
		return campaigninfo;
	}

	public WebElement getDeletbutton() {
		return deletbutton;
	}
	
	public String campaigninformation()
	{
		String text = campaigninfo.getText();
		return text;
	}
	
	public void deletcampaign() {
		deletbutton.click();
	}

}

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
	
	public void campaigninformation( String campaignname)
	{
		if((campaigninfo.getText()).contains(campaignname))
		{
			System.out.println("campaign is created");
		}else {
			System.out.println("campaign is notcreated");
		}
	}
	
	public void deletcampaign() {
		deletbutton.click();
	}

}

package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class LoginPage extends Webdriver_Utilities  {
WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement usernametf;

	@FindBy(name="user_password")
	private WebElement passwodtf;

	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsernametf() {
		return usernametf;
	}

	public WebElement getPasswodtf() {
		return passwodtf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void logintoapp(String aurl, String ausername, String apassword)
	{
		driver.get(aurl);
		//expliurl(driver, urltext);
		usernametf.sendKeys(ausername);
		passwodtf.sendKeys(apassword);
		loginbtn.click();
	}

}

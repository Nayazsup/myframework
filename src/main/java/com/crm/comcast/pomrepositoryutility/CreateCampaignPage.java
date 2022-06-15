package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenericUtilities.Webdriver_Utilities;

public class CreateCampaignPage extends Webdriver_Utilities {

			WebDriver driver;
		
		public CreateCampaignPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(name="campaignname")
		private WebElement campaignnametf;
		
		@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
		private WebElement addproductbtn;
		
		@FindBy(xpath="//a[.='zayn']")
		private WebElement productname;
		
		@FindBy(id="search_txt")
		private WebElement prosearchtf;
		
		@FindBy(name = "search_field")
		private WebElement inprodropdown;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement savebutton;
		
		

		public WebElement getSavebutton() {
			return savebutton;
		}

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getCampaignnamebtn() {
			return campaignnametf;
		}

		public WebElement getAddproductbtn() {
			return addproductbtn;
		}
		
		public void givecampaignname(String campaignname)
		{
			campaignnametf.sendKeys(campaignname);
		}
		
		public void addproduct(String parurltext) {
			
			addproductbtn.click();
			switchToWindow(driver,parurltext );
			
			
		}
		
		

		public WebElement getCampaignnametf() {
			return campaignnametf;
		}

		public WebElement getProductname() {
			return productname;
		}

		public WebElement getProsearchtf() {
			return prosearchtf;
		}

		public WebElement getInprodropdown() {
			return inprodropdown;
		}
		
		public void clickonproname(String visibletext)
		{
			productname.click();
			switchToWindow(driver, visibletext);
		}
		
		public void searchproduct(String productname)
		{
			prosearchtf.sendKeys(productname);
		}
		
		public void prodropdown(String visibletext)
		{
			selectbyvtext(inprodropdown, visibletext);
		}
		
		public void clicksave() {
			savebutton.click();
		}
		

	

}

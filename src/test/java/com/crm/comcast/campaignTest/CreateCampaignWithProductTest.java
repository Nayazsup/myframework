package com.crm.comcast.campaignTest;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.Baseclass;
import com.crm.comcast.GenericUtilities.Excel_Utilities;
import com.crm.comcast.GenericUtilities.File_Utilities;
import com.crm.comcast.GenericUtilities.Java_Utilities;
import com.crm.comcast.GenericUtilities.Webdriver_Utilities;
import com.crm.comcast.pomrepositoryutility.CampaignInformationPage;
import com.crm.comcast.pomrepositoryutility.CampaignPage;
import com.crm.comcast.pomrepositoryutility.CreateCampaignPage;
import com.crm.comcast.pomrepositoryutility.HomePage;
import com.crm.comcast.pomrepositoryutility.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignWithProductTest extends Baseclass {

	@Test(groups = "smoke")
	public void campwpro()throws Throwable {

		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		CampaignPage cp=new CampaignPage(driver);
		CreateCampaignPage ccp=new CreateCampaignPage(driver);
		CampaignInformationPage cip=new CampaignInformationPage(driver);
		
		hp.navcampaign();
		cp.clickonplusbutton();
	
		int oye = ju.getRandnum();

		String data = eu.getExceldata("Sheet1", 1, 2)+oye;
		ccp.givecampaignname(data);  
		
		ccp.addproduct("Products&action");
		String proname = eu.getExceldata("Sheet1", 2, 4);
		ccp.clickonproname(proname);
		ccp.clicksave();

		String actcamp = cip.getCampaigninfo().getText();
		if(actcamp.contains(data))
		{
			System.out.println("campaign with product is successfully created");
		}else
		{
			System.out.println("campaign with product is not successfully created");
		}
		
	}

}

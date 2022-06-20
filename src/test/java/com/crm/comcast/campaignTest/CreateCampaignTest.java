package com.crm.comcast.campaignTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.comcast.GenericUtilities.Baseclass;
import com.crm.comcast.pomrepositoryutility.CampaignInformationPage;
import com.crm.comcast.pomrepositoryutility.CampaignPage;
import com.crm.comcast.pomrepositoryutility.CreateCampaignPage;
import com.crm.comcast.pomrepositoryutility.HomePage;


@Listeners(com.crm.comcast.GenericUtilities.ListImpClass.class)
public class CreateCampaignTest extends Baseclass {

	@Test(groups = "smoke")
	public void createcamp() throws Throwable {

		HomePage hp=new HomePage(driver);
		CampaignPage cp=new CampaignPage(driver);
		CreateCampaignPage ccp=new CreateCampaignPage(driver);
		CampaignInformationPage cip=new CampaignInformationPage(driver);
	
		hp.navcampaign();
		cp.clickonplusbutton();

		int oye = ju.getRandnum();

		String data = eu.getExceldata("Sheet1", 1, 2)+oye;
		ccp.givecampaignname(data);
		ccp.clicksave();
		String act = cip.campaigninformation();
		Assert.assertEquals(act.contains(data),true);

	
	}

}




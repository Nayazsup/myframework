package com.crm.comcast.contactTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.Baseclass;
import com.crm.comcast.pomrepositoryutility.ContactInformationPage;
import com.crm.comcast.pomrepositoryutility.ContactPage;
import com.crm.comcast.pomrepositoryutility.CreateContactPage;
import com.crm.comcast.pomrepositoryutility.HomeContactPage;

@Listeners(com.crm.comcast.GenericUtilities.ListImpClass.class)
public class CreateContactTest extends Baseclass {
	@Test(groups = {"smoke","regression"})
	public void doit() throws Throwable
	{
		CreateContactPage ccp=new CreateContactPage(driver);
		HomeContactPage hc=new HomeContactPage(driver);
		ContactPage cp=new ContactPage(driver);
		ContactInformationPage cip=new ContactInformationPage(driver);

		hc.homecontact();
		cp.clickonplus();
		
		int oye = ju.getRandnum();
		String data = eu.getExceldata("Sheet1", 1, 2)+oye;
		ccp.lastname(data);

		ccp.clicksave();

		String actxt = cip.contactinfotext();
		Assert.assertEquals(actxt.contains(data),true);
	}
}

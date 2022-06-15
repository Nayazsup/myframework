package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.Baseclass;
import com.crm.comcast.pomrepositoryutility.ContactInformationPage;
import com.crm.comcast.pomrepositoryutility.ContactPage;
import com.crm.comcast.pomrepositoryutility.CreateContactPage;
import com.crm.comcast.pomrepositoryutility.HomeContactPage;

public class DeletContactTest  extends Baseclass{
@Test(groups = "regression")
	public void deletit() throws Throwable
	{
		
		ContactPage cp=new ContactPage(driver);
		HomeContactPage hcp=new HomeContactPage(driver);
		CreateContactPage ccp=new CreateContactPage(driver);
		ContactInformationPage cip=new ContactInformationPage(driver);
		
		hcp.homecontact();

		cp.clickonplus();

		int oye = ju.getRandnum();
		String data = eu.getExceldata("Sheet1", 1, 2)+oye;
		ccp.lastname(data);
		ccp.clicksave();
		cip.deletcontact();
		wu.explititle(driver, "Contacts");

	}
}


package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.Baseclass;
import com.crm.comcast.pomrepositoryutility.ContactInformationPage;
import com.crm.comcast.pomrepositoryutility.ContactPage;
import com.crm.comcast.pomrepositoryutility.CreateContactPage;
import com.crm.comcast.pomrepositoryutility.HomeContactPage;

public class CreateContactNoMandate extends Baseclass {
@Test
	public void savu() throws Throwable
	{
		
		CreateContactPage ccp=new CreateContactPage(driver);
		HomeContactPage hc=new HomeContactPage(driver);
		ContactPage cp=new ContactPage(driver);
		ContactInformationPage cip=new ContactInformationPage(driver);
		
		hc.homecontact();
		cp.clickonplus();
		
		ccp.clicksave();
		
		
		wu.alertAccept(driver, "Last Name cannot be empty");
		
		

	}
}

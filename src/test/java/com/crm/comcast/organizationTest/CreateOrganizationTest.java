package com.crm.comcast.organizationTest;

import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.Baseclass;
import com.crm.comcast.pomrepositoryutility.CreateOrganizationPage;
import com.crm.comcast.pomrepositoryutility.HomePage;
import com.crm.comcast.pomrepositoryutility.OrganizationInformationPage;
import com.crm.comcast.pomrepositoryutility.OrganizationPage;

public class CreateOrganizationTest extends Baseclass {
	@Test
	public void createorg() throws InterruptedException, Throwable  {

		HomePage hp=new HomePage(driver);
		OrganizationPage op=new OrganizationPage(driver);
		CreateOrganizationPage cop=new CreateOrganizationPage(driver);
		
		OrganizationInformationPage oip=new OrganizationInformationPage(driver);
	
		int oye = ju.getRandnum();
		String data = eu.getExceldata("Sheet1", 2, 2)+oye;
		System.out.println(data);
		
		hp.navorgan();
		op.neworganizaion();
		cop.enterorganname(data);
		
		cop.clickonsave();
		
		oip.organinfo(data);


	}	

}

package Practice;

import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.Baseclass;
import com.crm.comcast.pomrepositoryutility.CampaignInformationPage;
import com.crm.comcast.pomrepositoryutility.CampaignPage;
import com.crm.comcast.pomrepositoryutility.ContactInformationPage;
import com.crm.comcast.pomrepositoryutility.ContactPage;
import com.crm.comcast.pomrepositoryutility.CreateCampaignPage;
import com.crm.comcast.pomrepositoryutility.CreateContactPage;
import com.crm.comcast.pomrepositoryutility.HomeContactPage;
import com.crm.comcast.pomrepositoryutility.HomePage;
import com.crm.comcast.pomrepositoryutility.LoginPage;

public class Hybrid extends Baseclass {
	@Test
public void createcamp() throws Throwable {

		
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
		ccp.clicksave();

		if((cip.getCampaigninfo().getText()).contains(data))
		{
			System.out.println("campaign created");
		}
		else
		{
			System.out.println("campaign not created");
		}	
	}
@Test
public void createcontact() throws Throwable
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
	if( actxt.contains(data))
	{
		System.out.println("contact created");
	}else
	{
		System.out.println("contact not created");
	}
}

}
